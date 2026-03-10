# Day 9 — Arrays (More Advanced)

## 📚 Topics Covered

* Trapping Rainwater Problem
* Best Time to Buy and Sell Stock

## 🧠 Key Learnings

### Trapping Rainwater

The **Trapping Rainwater problem** asks us to calculate how much rainwater can be trapped between bars of different heights after raining.

Each element of the array represents the **height of a bar**, and water can be stored between bars if there are taller bars on both sides.

The optimized idea is:

* Find the **maximum height on the left side** of every element.
* Find the **maximum height on the right side** of every element.
* The water stored at any index is:

```
min(leftMax, rightMax) - height[i]
```

If the value is positive, water is trapped at that position. Summing all such values gives the **total trapped rainwater**.

Time Complexity:

```
O(n)
```

Space Complexity:

```
O(n)
```

---

### Best Time to Buy and Sell Stock

This problem asks us to find the **maximum profit** that can be achieved by buying a stock on one day and selling it on a later day.

The key idea is:

* Keep track of the **minimum price seen so far**.
* For each day, calculate the possible profit if the stock is sold on that day.

```
profit = currentPrice - minPrice
```

* Update the **maximum profit** whenever a larger profit is found.

This ensures we always buy at the **lowest price before selling**.

Time Complexity:

```
O(n)
```

Space Complexity:

```
O(1)
```

## 💻 Problems Solved

| # | Problem                         | 
| - | ------------------------------- | 
| 1 | Trapping Rainwater              |
| 2 | Best Time to Buy and Sell Stock | 

---

*Day 9 done. Arrays problem solving getting stronger.* ✅
