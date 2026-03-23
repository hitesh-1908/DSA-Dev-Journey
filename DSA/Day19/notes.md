# Day 19 — Bit Manipulation

## 📚 Topics Covered

* Get ith Bit
* Set ith Bit
* Clear ith Bit
* Update ith Bit
* Clear Last i Bits
* Clear Range of Bits
* Check if a Number is Power of 2
* Count Set Bits in a Number
* Fast Exponentiation

## 🧠 Key Learnings

* Today I continued Bit Manipulation and learned how to **manipulate specific bits using bitwise operations**.
* Learned how to **get the ith bit** using bitwise AND:

```java
(n & (1 << i))
```

* Understood how to **set the ith bit** (make it 1):

```java
(n | (1 << i))
```

* Learned how to **clear the ith bit** (make it 0):

```java
(n & ~(1 << i))
```

* For **updating a bit**, first clear it and then set it based on requirement.
* Learned how to **clear last i bits**:

```java
(n & (~0 << i))
```

* Learned how to **clear a range of bits** using masks.
* Understood how to check if a number is a **power of 2**:

```java
(n & (n - 1)) == 0
```

* Learned how to **count set bits (1s)** in a number using bit manipulation.
* Studied **fast exponentiation**, which calculates power efficiently using binary representation.

## 💻 Problems / Practice

| # | Problem             | File                    |
| - | ------------------- | ----------------------- |
| 1 | Get ith Bit         | GetIthBit.java          |
| 2 | Set ith Bit         | SetIthBit.java          |
| 3 | Clear ith Bit       | ClearIthBit.java        |
| 4 | Update ith Bit      | UpdateIthBit.java       |
| 5 | Clear Last i Bits   | ClearLastIBits.java     |
| 6 | Clear Range of Bits | ClearRangeBits.java     |
| 7 | Power of 2 Check    | PowerOfTwo.java         |
| 8 | Count Set Bits      | CountSetBits.java       |
| 9 | Fast Exponentiation | FastExponentiation.java |

---

*Day 19 done. Bit manipulation getting stronger.* ✅
