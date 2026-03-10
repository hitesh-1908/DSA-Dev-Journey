# Day 8 — Arrays (More Advanced)

## 📚 Topics Covered

* Max Subarray Sum using Brute Force Approach
* Max Subarray Sum using Prefix Sum Approach
* Max Subarray Sum using Kadane's Algorithm

## 🧠 Key Learnings

* Today I studied different approaches to solve the **Maximum Subarray Sum** problem.

### Max Subarray Sum (Brute Force Approach)

In this approach, we generate **all possible subarrays** from the given array and calculate the sum of each subarray. After calculating all the sums, we keep track of the **maximum sum** obtained. This method is simple to understand but inefficient because it checks every possible subarray.

### Max Subarray Sum (Prefix Sum Approach)

This approach improves the brute force method by using a **prefix sum array**. A prefix sum array stores the cumulative sum of elements up to each index. Using this array, the sum of any subarray can be calculated quickly without looping through all elements again.

### Kadane's Algorithm

Kadane's Algorithm is the **most optimized approach** to solve the Maximum Subarray Sum problem. It works by maintaining a **current sum** and a **maximum sum** while iterating through the array. If the current sum becomes negative, it is reset to zero because a negative sum would decrease the total of any future subarray.

## 💻 Problems Solved

| # | Problem                               | File                       |
| - | ------------------------------------- | -------------------------- |
| 1 | Max Subarray Sum (Brute Force)        | MaxSubarrayBruteForce.java |
| 2 | Max Subarray Sum (Prefix Sum)         | MaxSubarrayPrefixSum.java  |
| 3 | Max Subarray Sum (Kadane's Algorithm) | MaxSubarrayKadane.java     |

---

*Day 8 done. Arrays getting more advanced.* ✅
