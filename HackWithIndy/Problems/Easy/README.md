# 📌 Array Query Processing (Infosys Problem)

## 🚀 Problem Overview

You are given:

* An array `A` of size `n`
* `q` queries of two types:

### 🔹 Query Types

1. **Type 1 (Update Query)**
   `(1, l, r)`
   Update elements in range `[l, r]` as:

   ```
   A[i] = (i - l + 1) * A[l]
   ```

2. **Type 2 (Sum Query)**
   `(2, l, r)`
   Compute the sum:

   ```
   A[l] + A[l+1] + ... + A[r]
   ```

### 🎯 Goal

Return the **sum of all Type 2 query results**.

---

## 🧠 Approach Used

### ✔️ Brute Force Simulation

* Directly simulate each query
* For update queries → modify the array
* For sum queries → iterate and accumulate

### ✔️ Key Idea

* For **Type 1**, use `A[l]` as base and generate sequence
* For **Type 2**, simply sum elements in range

---

## 🧾 Code Implementation (Java)

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        
        int q = sc.nextInt();
        int sum = 0;
        
        while(q-- > 0){
            int type = sc.nextInt();
            int left = sc.nextInt();
            int right = sc.nextInt();
            
            if(type == 1){
                int temp = arr[left];
                for(int i = left; i <= right; i++) 
                    arr[i] = temp * (i - left + 1);
            }
            else{
                for(int i = left; i <= right; i++) 
                    sum += arr[i];
            }
        }
        
        System.out.print(sum);
    }
}
```

---

## 📊 Example

### Input

```
A = [1, 4, 5, 1, 6, 7, 8]
Queries:
1 1 6
1 1 5
2 5 5
2 3 4
2 3 3
```

### Output

```
60
```

---

## ⏱️ Complexity Analysis

| Operation    | Time Complexity |
| ------------ | --------------- |
| Type 1 Query | O(n)            |
| Type 2 Query | O(n)            |
| Total        | O(n × q)        |

### ⚠️ Limitation

* Not efficient for large constraints (`n, q ≤ 10^5`)
* May cause **TLE (Time Limit Exceeded)**

---

## ⚡ Optimization Idea (For Future Improvement)

To optimize:

* Use **Segment Tree with Lazy Propagation**
* Maintain:

  * Range updates efficiently
  * Fast range sum queries

---

## ✅ Features of Your Solution

* Simple and easy to understand
* Direct implementation
* Works correctly for small to medium inputs

---

## 📌 Conclusion

This solution demonstrates a clear **brute-force simulation approach**.
For competitive coding or large inputs, consider upgrading to an optimized data structure like **Segment Tree**.

---

🔥 *Good job building this logic, machan! Next step → optimize it like a pro 💪*
