# Day 18 — Bit Manipulation

## 📚 Topics Covered

* Introduction to Bit Manipulation
* Binary Number System
* Bitwise Operators
* Binary 1's Complement
* Binary Left Shift
* Binary Right Shift
* Check if Odd or Even

## 🧠 Key Learnings

* Today I started learning **Bit Manipulation**, which works directly on the binary representation of numbers.
* Understood the **binary number system**, where numbers are represented using only `0` and `1`.
* Learned about **bitwise operators** like:

  * `AND (&)`
  * `OR (|)`
  * `XOR (^)`
  * `NOT (~)`
* Understood **1’s complement**, where all bits of a number are flipped (`0 → 1` and `1 → 0`).
* Learned how **left shift (`<<`)** multiplies a number by 2 and **right shift (`>>`)** divides a number by 2.
* Practiced checking whether a number is **odd or even using bit manipulation**:

```java id="k1x8pz"
if((n & 1) == 0)
    System.out.println("Even");
else
    System.out.println("Odd");
```

* This method is faster than using the modulo operator and is commonly used in optimized solutions.

## 💻 Problems / Practice

| # | Problem                     | File            |
| - | --------------------------- | --------------- |
| 1 | Check Odd or Even using Bit | OddEvenBit.java |

---

*Day 18 done. Bit manipulation basics unlocked.* ✅
