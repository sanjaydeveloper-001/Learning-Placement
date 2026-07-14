# Print Mismatched Characters Between Two Strings

## Question

Given **two strings of equal length**, compare them character by character and print the mismatched characters.

### Rules

- If **two consecutive characters** are mismatched, print them together as one group.
- If a **single character** is mismatched, print that character pair individually.
- Continue this process until the end of the strings.

---

## Example

**Input**
```text
S1 = abcdefghi
S2 = abdeeggii
```

**Output**
```text
cd, de
f, g
h, i
```

**Explanation**

- `c` and `d` mismatch with `d` and `e`, so they are printed together.
- `f` mismatches with `g`.
- `h` mismatches with `i`.

---

## Test Cases

### Test Case 1

**Input**
```text
abcdefghi
abdeeggii
```

**Output**
```text
cd, de
f, g
h, i
```

---

### Test Case 2

**Input**
```text
hello
hallo
```

**Output**
```text
e, a
```

---

### Test Case 3

**Input**
```text
abcdefghij
abxyefuvij
```

**Output**
```text
cd, xy
gh, uv
```

---

# Solution Approach

1. Read the two input strings.
2. Traverse both strings from left to right.
3. At each position:
   - Compare the current characters.
   - Also compare the next characters.
4. If both the current and next characters mismatch, print both characters together and skip the next index.
5. Otherwise, if only the current characters mismatch, print that mismatched pair.
6. Continue until the end of the string.

### Time Complexity

- **O(n)**

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
        
        String st1 = sc.next();
        String st2 = sc.next();
        
        int n = st1.length();
        
        for(int i=0; i<n-1; i++){
            char ch1 = st1.charAt(i);
            char ch2 = st2.charAt(i);
            
            char ch3 = st1.charAt(i+1);
            char ch4 = st2.charAt(i+1);
            
            if(ch1 != ch2 && ch3 != ch4){
                System.out.println(ch1 + "" + ch3 + ", " + ch2 + "" + ch4 + " ");
                i++;
            }
            else if(ch1 != ch2){
                System.out.println(ch1 + ", " + ch2);
            }
        }
    }
}
```
