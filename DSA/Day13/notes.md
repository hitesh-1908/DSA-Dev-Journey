# Day 13 — Strings

## 📚 Topics Covered

* Definition
* Input / Output
* How to Calculate String Length
* String Concatenation
* String Methods
* Check if a String is Palindrome
* String Functions like Compare & Substring

## 🧠 Key Learnings

### Definition

A **String** is a sequence of characters used to represent text in a program.

Example:

```id="8zaf3p"
"Hello"
```

In Java, strings are **objects of the String class**.

---

### Input / Output

Strings can be taken as input using the **Scanner class**.

Example:

```id="k3qj1m"
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
```

Printing a string:

```id="w0yt6h"
System.out.println(name);
```

---

### How to Calculate String Length

The length of a string can be found using the **length() method**.

Example:

```id="2qjv1b"
String str = "Hello";
System.out.println(str.length());
```

---

### String Concatenation

String concatenation means **joining two or more strings together**.

Example:

```id="3y6q9h"
String first = "Hello";
String second = "World";

String result = first + " " + second;
```

Output:

```id="p0o1g7"
Hello World
```

---

### String Methods

Some commonly used string methods include:

* `length()` → returns the length of a string
* `charAt(index)` → returns the character at a specific index
* `toUpperCase()` → converts string to uppercase
* `toLowerCase()` → converts string to lowercase
* `trim()` → removes leading and trailing spaces

---

### Check if a String is Palindrome

A string is called a **palindrome** if it reads the same forward and backward.

Example:

```id="d5g7qs"
madam
```

Approach:

* Compare characters from the **start and end** of the string.
* If all characters match, the string is a palindrome.

---

### String Functions (Compare & Substring)

**Compare Strings**

Strings can be compared using:

```id="r4v3t1"
str1.equals(str2)
```

or

```id="f9n2q0"
str1.compareTo(str2)
```

---

**Substring**

The `substring()` method extracts a part of the string.

Example:

```id="m5d3k7"
String str = "HelloWorld";
str.substring(0,5);
```

Output:

```id="j1c8u4"
Hello
```

---

*Day 13 done. Strings unlocked.* ✅
