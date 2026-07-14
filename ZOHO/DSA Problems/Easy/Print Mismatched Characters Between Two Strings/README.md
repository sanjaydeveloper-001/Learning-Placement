# Print Mismatched Characters Between Two Strings

## Question

Given **two strings of equal length**, compare them character by character and print the mismatched characters.

### Rules

* If **consecutive characters** are mismatched, group them together and print them as a single pair.
* If only **one character** is mismatched, print that character pair individually.
* If **no mismatches** are found, print **`No mismatches`**.

---

## Example

**Input**

```
S1 = "abcdefghi"
S2 = "abdeeggii"
```

**Output**

```
cd , de
f , g
h , i
```

**Explanation**

* `c` and `d` mismatch with `d` and `e`, and they are consecutive, so they are grouped.
* `f` mismatches with `g`.
* `h` mismatches with `i`.

---

## Test Cases

### Test Case 1

**Input**

```
S1 = "abcdefghi"
S2 = "abdeeggii"
```

**Output**

```
cd , de
f , g
h , i
```

---

### Test Case 2

**Input**

```
S1 = "hello"
S2 = "hallo"
```

**Output**

```
e , a
```

---

### Test Case 3

**Input**

```
S1 = "abcdefgh"
S2 = "abcxyzgh"
```

**Output**

```
def , xyz
```

---

# Solution Approach

1. Read the two input strings.
2. Traverse both strings simultaneously.
3. Whenever a mismatch is found:

   * Start collecting consecutive mismatched characters from both strings.
   * Continue until characters become equal or the string ends.
4. Print the collected mismatched substring from both strings.
5. If no mismatch is found throughout the traversal, print **`No mismatches`**.

### Time Complexity

* **O(n)**

### Space Complexity

* **O(1)** (excluding the output strings)

---

# Solution (Java)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        boolean found = false;
        int i = 0;

        while (i < s1.length()) {

            if (s1.charAt(i) != s2.charAt(i)) {

                StringBuilder a = new StringBuilder();
                StringBuilder b = new StringBuilder();

                while (i < s1.length() && s1.charAt(i) != s2.charAt(i)) {
                    a.append(s1.charAt(i));
                    b.append(s2.charAt(i));
                    i++;
                }

                System.out.println(a + " , " + b);
                found = true;

            } else {
                i++;
            }
        }

        if (!found) {
            System.out.println("No mismatches");
        }

        sc.close();
    }
}
```
