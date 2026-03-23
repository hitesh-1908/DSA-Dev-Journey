# Day 22 — Strings (Continued)

## 📚 Topics Covered

* Print Largest String
* Why Strings are Immutable
* StringBuilder
* Converting Letters to Uppercase
* String Compression

## 🧠 Key Learnings

### Print Largest String

* Learned how to find the **largest string lexicographically** using comparison methods like `compareTo()`.

---

### Why Strings are Immutable (Brief)

In Java, strings are **immutable**, which means once a string object is created, its value **cannot be changed**.

Reasons:

* **Security** → Strings are widely used in sensitive areas like passwords, file paths, and network connections. Immutability ensures they cannot be modified unexpectedly.
* **String Pool Optimization** → Java stores strings in a special memory area called the **String Pool**. Since strings are immutable, multiple references can safely point to the same object, saving memory.
* **Thread Safety** → Immutable objects are automatically thread-safe because their values cannot change.
* **Performance** → Hashcodes of strings are cached, making them efficient for use in data structures like HashMap.

Example:

```java
String str = "Hello";
str.concat(" World");
System.out.println(str); // Output: Hello
```

Here, `"Hello World"` is created as a new object, but `str` still points to `"Hello"`.

👉 To modify strings efficiently, we use **StringBuilder**.


### StringBuilder

* **StringBuilder** is mutable, meaning strings can be modified without creating new objects.
* It is more efficient for operations like appending and modifying strings.

---

### Converting Letters to Uppercase

* Practiced logic to convert characters of a string into **uppercase**.
* Useful in formatting and string manipulation problems.

---

### String Compression

* Learned how to **compress a string** by replacing repeating characters with the character followed by its count.

Example:

```id="9k3hfd"
aaabbcc → a3b2c2
```

---

## 💻 Practice

| # | Problem              | File                     |
| - | -------------------- | ------------------------ |
| 1 | Print Largest String | LargestString.java       |
| 2 | StringBuilder Usage  | StringBuilderDemo.java   |
| 3 | Convert to Uppercase | UppercaseConversion.java |
| 4 | String Compression   | StringCompression.java   |

---

*Day 22 done. Strings getting stronger.* ✅
