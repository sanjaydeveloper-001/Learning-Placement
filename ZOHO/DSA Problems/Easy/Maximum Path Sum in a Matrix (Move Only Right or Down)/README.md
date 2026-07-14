# README.md

# Maximum Path Sum in a Matrix (Move Only Right or Down)

## Question

Given a matrix of integers, find the **maximum possible sum** while traversing from the **top-left corner** to the **bottom-right corner**.

### Rules

- Start from the **top-left** cell `(0,0)`.
- End at the **bottom-right** cell `(R-1,C-1)`.
- You can move **only Right** or **Down**.
- Print the **maximum path sum**.

---

## Example

**Input**
```text
2 3
15 25 30
45 25 60
```

**Output**
```text
Max :145
```

**Explanation**

Possible paths:

```text
15 → 25 → 30 → 60 = 130

15 → 25 → 25 → 60 = 125

15 → 45 → 25 → 60 = 145   (Maximum)
```

---

## Test Cases

### Test Case 1

**Input**
```text
2 3
15 25 30
45 25 60
```

**Output**
```text
Max :145
```

---

### Test Case 2

**Input**
```text
3 3
1 2 3
4 5 6
7 8 9
```

**Output**
```text
Max :29
```

---

### Test Case 3

**Input**
```text
2 2
5 8
6 4
```

**Output**
```text
Max :19
```

---

# Solution Approach 1 (Recursive)

### Algorithm

1. Read the matrix.
2. Start recursion from the top-left cell.
3. At every cell, recursively move:
   - Down
   - Right
4. Add the current cell value to the running sum.
5. When the destination is reached, update the maximum sum.
6. Print the maximum sum after all paths are explored.

### Time Complexity

- **O(2^(R+C))**

### Space Complexity

- **O(R+C)** (Recursion Stack)

---

## Solution (Java)

```java
import java.util.Scanner;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++) arr[i][j] = sc.nextInt();
        }
        
        help(arr,0,0,0);
        System.out.print("Max :"+max);
    }
    
    static int max = 0;
    
    static void help(int arr[][], int i, int j, int sum){
        int r = arr.length;
        int c = arr[0].length;
        
        if(i >= r || j >= c)
            return;
            
        if(i == r-1 && j == c-1)
            max = Math.max(sum + arr[i][j], max);
        
        help(arr, i+1, j, sum+arr[i][j]);
        help(arr, i, j+1, sum+arr[i][j]);
    }
}
```

---

# Solution Approach 2 (Dynamic Programming)

### Algorithm

1. Read the matrix.
2. Traverse every cell.
3. For the first row, add the left cell value.
4. For the first column, add the upper cell value.
5. For the remaining cells:
   - Add the maximum of the top and left cells.
6. The bottom-right cell stores the maximum path sum.

### Time Complexity

- **O(R × C)**

### Space Complexity

- **O(1)** (In-place DP)

---

## Solution (Java)

```java
import java.util.Scanner;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++) arr[i][j] = sc.nextInt();
        }
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(i == 0 && j > 0)
                    arr[i][j] += arr[i][j-1];
                else if(i > 0 && j == 0)
                    arr[i][j] += arr[i-1][j];
                else if(i > 0 && j > 0)
                    arr[i][j] += Math.max(arr[i][j-1], arr[i-1][j]);
            }
        }
        
        System.out.print("Max:"+arr[r-1][c-1]);
    }
}
```

---

# Comparison of Both Approaches

| Feature | Recursive | Dynamic Programming |
|---------|-----------|---------------------|
| Technique | Brute Force | Bottom-Up DP |
| Time Complexity | **O(2^(R+C))** | **O(R × C)** |
| Space Complexity | **O(R+C)** | **O(1)** |
| Suitable For | Small Matrices | Large Matrices |
| Performance | Slower | Faster |
| Recommended | ❌ | ✅ |
