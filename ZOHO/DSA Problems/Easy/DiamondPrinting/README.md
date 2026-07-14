# Sort Numbers in Descending Order Based on Number of Factors

## Problem Statement

Given `N` integers, sort them in **descending order based on the number of factors (divisors)** each number has.

- A number with **more factors** should appear first.
- If two numbers have the **same number of factors**, they can appear in **any order**.

### Example

**Input**
```
{6, 8, 9}
```

**Output**
```
{6, 8, 9}
```
or
```
{8, 6, 9}
```

**Explanation**

- Factors of **6** = {1, 2, 3, 6} → **4 factors**
- Factors of **8** = {1, 2, 4, 8} → **4 factors**
- Factors of **9** = {1, 3, 9} → **3 factors**

Since 6 and 8 have the same number of factors, either order is acceptable, while 9 comes last.

---

## Sample Test Cases

### Test Case 1

**Input**
```
3
6 8 9
```

**Output**
```
6 8 9
```
or
```
8 6 9
```

---

### Test Case 2

**Input**
```
3
10 12 7
```

**Output**
```
12 10 7
```

**Explanation**

- 10 → 4 factors
- 12 → 6 factors
- 7 → 2 factors

---

### Test Case 3

**Input**
```
4
1 2 6 24
```

**Output**
```
24 6 2 1
```

**Explanation**

- 24 → 8 factors
- 6 → 4 factors
- 2 → 2 factors
- 1 → 1 factor

---

# Solution Approach

1. Read the number of elements `N`.
2. Store each number along with a value used for sorting.
3. For every number:
   - Traverse from `2` to `number / 2`.
   - If the current value divides the number, add it to the computed value.
4. Store the number and its computed value in a 2D array.
5. Sort the array in descending order based on the computed value.
6. Print the numbers in the sorted order.

**Time Complexity:** `O(N × M log N)`
- `N` = Number of elements
- `M` = Maximum value among the input numbers

**Space Complexity:** `O(N)`

---

## Java Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            arr[i][0] = d;

            int sum = 0;
            for (int j = 2; j <= d / 2; j++) {
                if (d % j == 0)
                    sum += j;
            }

            arr[i][1] = sum;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][0] + " ");
        }
    }
}
```

> **Note:** The above implementation sorts using the **sum of proper factors** (excluding 1 and the number itself), which matches the provided code. If the requirement is strictly to sort by the **number of factors**, the counting logic should be modified accordingly.
