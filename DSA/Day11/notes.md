# Day 11 — Sorting

## 📚 Topics Covered

* Bubble Sort (Optimized)
* Selection Sort
* Insertion Sort
* Counting Sort
* Inbuilt Sort

  * For Ascending Order
  * For Descending Order

## 🧠 Key Learnings

### Bubble Sort (Optimized)

Bubble Sort works by **repeatedly comparing adjacent elements and swapping them if they are in the wrong order**.

In the optimized version, I used a **flag variable** to check whether any swap happened during a pass. If no swap occurs, it means the array is **already sorted**, so the algorithm stops early.

Best Case Time Complexity

```
O(n)
```

Worst Case Time Complexity

```
O(n²)
```

---

### Selection Sort

Selection Sort works by **repeatedly selecting the smallest element from the unsorted part of the array** and placing it at the beginning.

Steps:

1. Find the smallest element in the unsorted portion.
2. Swap it with the first unsorted element.
3. Repeat the process for the remaining array.

Time Complexity

```
O(n²)
```

This complexity remains the same for best, average, and worst cases.

---

### Insertion Sort

Insertion Sort builds the sorted array **one element at a time**.

Each element is taken and **inserted into its correct position** in the already sorted portion of the array.

Best Case Time Complexity

```
O(n)
```

Worst Case Time Complexity

```
O(n²)
```

This algorithm works well for **small datasets and nearly sorted arrays**.

---

### Counting Sort

Counting Sort is a **non-comparison based sorting algorithm**.

Instead of comparing elements, it counts the number of occurrences of each value and uses that information to place elements in the correct position.

It works best when the **range of input values is not very large**.

Time Complexity

```
O(n + k)
```

Where:

* `n` = number of elements
* `k` = range of input values

---

### Inbuilt Sort

Java also provides an **inbuilt sorting method** using `Arrays.sort()` which internally uses optimized sorting algorithms.

#### Ascending Order

**Method 1**

```id="2a6a5y"
Arrays.sort(arr);
```

**Method 2 (Sorting a specific range)**

```id="b5l6q9"
Arrays.sort(arr, startIndex, endIndex);
```

---

#### Descending Order

**Method 1**

```id="t6u5lp"
Arrays.sort(arr, Collections.reverseOrder());
```

**Method 2 (Descending in a specific range)**

```id="u4wmp4"
Arrays.sort(arr, startIndex, endIndex, Collections.reverseOrder());
```

Note: `Collections.reverseOrder()` works with **Integer arrays**, not primitive `int[]`.

---

*Day 11 done. Sorting concepts getting stronger.* ✅

*Day 11 done. Sorting concepts getting stronger.* ✅
