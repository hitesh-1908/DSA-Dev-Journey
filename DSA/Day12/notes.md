# Day 12 — 2D Arrays

## 📚 Topics Covered

* Definition & Introduction of 2D Array
* Representation of 2D Array
* Creation of 2D Array
* 2D Array in Memory
* Spiral Matrix
* Diagonal Sum
* Search in Sorted Matrix

## 🧠 Key Learnings

### Definition & Introduction of 2D Array

A **2D Array** is an array of arrays used to store data in **row and column format**, similar to a matrix.

Example:

```id="7g6yqj"
1 2 3
4 5 6
7 8 9
```

Each element is accessed using two indices:

```id="x2v9a1"
array[row][column]
```

---

### Representation of 2D Array

A 2D array can be visualized as a **table structure consisting of rows and columns**.

Example representation:

```id="a7ck4k"
int matrix[3][3]
```

Which means the matrix has:

* **3 rows**
* **3 columns**

---

### Creation of 2D Array

A 2D array in Java can be created as:

```id="t3h6b9"
int matrix[][] = new int[3][3];
```

It can also be initialized directly:

```id="v8kw2m"
int matrix[][] = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
};
```

---

### 2D Array in Memory

In Java, a 2D array is actually an **array of arrays**.

Memory representation:

```id="m8y8ps"
matrix
 ├── row0 → [1,2,3]
 ├── row1 → [4,5,6]
 └── row2 → [7,8,9]
```

Each row is stored as a separate array in memory.

---

### Spiral Matrix

In the **Spiral Matrix problem**, the elements of a matrix are printed in **spiral order**.

Traversal order:

1. Top row → left to right
2. Right column → top to bottom
3. Bottom row → right to left
4. Left column → bottom to top

Example matrix:

```id="2g5rnx"
1 2 3
4 5 6
7 8 9
```

Spiral output:

```id="p1r2bx"
1 2 3 6 9 8 7 4 5
```

---

### Diagonal Sum

The **Diagonal Sum problem** calculates the sum of the **primary diagonal** and **secondary diagonal** of a square matrix.

Example matrix:

```id="4p9t1v"
1 2 3
4 5 6
7 8 9
```

Primary diagonal:

```id="u7v5p9"
1 5 9
```

Secondary diagonal:

```id="g6r4md"
3 5 7
```

The total diagonal sum is obtained by adding both diagonals.

---

### Search in Sorted Matrix

In this problem, the matrix is **sorted in increasing order both row-wise and column-wise**.

A common optimized approach is to start from the **top-right corner**:

* If the current element equals the target → element found.
* If the current element is greater than the target → move **left**.
* If the current element is smaller than the target → move **down**.

This method avoids checking every element.

Time Complexity:

```id="q1n5gc"
O(n + m)
```

Where:

* `n` = number of rows
* `m` = number of columns

---

*Day 12 done. 2D arrays problem solving continues.* ✅
