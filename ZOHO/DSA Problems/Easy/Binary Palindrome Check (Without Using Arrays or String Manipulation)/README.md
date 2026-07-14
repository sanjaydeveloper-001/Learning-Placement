# Binary Palindrome Check (Without Using Arrays or String Manipulation)

## Question

Given a **decimal number**, convert it to its **binary representation** and determine whether the binary number is a **palindrome**.

### Constraints

* **Do not use arrays.**
* **Do not use string manipulation methods.**
* Perform the palindrome check using arithmetic/bitwise operations only.

If the binary representation reads the same from left to right and right to left, print:

```text
<binary> - Palindrome
```

Otherwise, print:

```text
<binary> - Not a Palindrome
```

---

## Example

**Input**

```text
5
```

**Binary**

```text
101
```

**Output**

```text
101 - Palindrome
```

**Explanation**

The binary representation of **5** is **101**, which reads the same forwards and backwards. Hence, it is a palindrome.

---

## Test Cases

### Test Case 1

**Input**

```text
5
```

**Output**

```text
101 - Palindrome
```

---

### Test Case 2

**Input**

```text
10
```

**Output**

```text
1010 - Not a Palindrome
```

---

### Test Case 3

**Input**

```text
21
```

**Output**

```text
10101 - Palindrome
```

---

# Solution Approach

1. Read the decimal number.
2. Convert the number into its binary representation using repeated division by 2.
3. Store the binary digits as a numeric value (without using strings or arrays).
4. Reverse the binary number using arithmetic operations.
5. Compare the original binary number with its reversed version.
6. If both are equal, print **Palindrome**; otherwise, print **Not a Palindrome**.

### Time Complexity

* **O(log₂ n)**

### Space Complexity

* **O(1)**

---

# Solution (Java)

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("0 - Palindrome");
            return;
        }

        int temp = n;
        long binary = 0;
        long place = 1;

        // Convert decimal to binary (stored as a number)
        while (temp > 0) {
            binary += (temp % 2) * place;
            place *= 10;
            temp /= 2;
        }

        long original = binary;
        long reverse = 0;

        // Reverse the binary number
        while (binary > 0) {
            reverse = reverse * 10 + (binary % 10);
            binary /= 10;
        }

        if (original == reverse) {
            System.out.println(original + " - Palindrome");
        } else {
            System.out.println(original + " - Not a Palindrome");
        }

        sc.close();
    }
}
```
