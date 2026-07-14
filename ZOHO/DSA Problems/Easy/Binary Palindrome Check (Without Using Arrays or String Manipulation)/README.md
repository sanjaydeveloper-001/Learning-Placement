# Binary Palindrome Check

## Question

Given a decimal number, convert it to its binary representation and determine whether the binary number is a palindrome.

### Constraints

- Do not use arrays.
- Do not use string manipulation.
- Print the binary representation followed by whether it is a palindrome.

---

## Example

**Input**
```text
5
```

**Output**
```text
101 - Palindrome
```

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

1. Read the input number.
2. Reverse the digits of the number.
3. Compare the reversed number with the original.
4. If both are equal, print **Palindrome**; otherwise print **Not a Palindrome**.

### Time Complexity

- **O(log n)**

### Space Complexity

- **O(1)**

---

# Solution (Java)

```java
import java.util.Scanner;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int temp = n;
        int temp2 = 0;
        
        while(temp > 0){
            temp2 = (temp2*10) + (temp%10);
            temp /= 10;
        }
        
        System.out.print(n+((temp2 == n)? " - Palindrome" : " - Not a Palindrome"));
        
    }
}
```
