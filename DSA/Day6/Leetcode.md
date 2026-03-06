## Check If Binary String Has at Most One Segment of Ones (Easy)

Today I solved a LeetCode **easy** problem based on **strings and simple iteration**.

The logic for solving this problem came from what I learned yesterday about **loops and bit patterns**.

### Approach

The given binary string starts with **1s**, and the task is to check whether there is **only one continuous segment of `1`s**.

My approach was:

1. Convert the string into a **character array** so it becomes easier to traverse using indexes.
2. Iterate through the array starting from index `1`.
3. For each character, compare it with the **previous character**.
4. If I find a pattern where:

```
previous = '0'
current  = '1'
```

it means a **new segment of 1s has started**, which violates the condition.

5. In that case, return **false**.
6. If the loop finishes without finding such a pattern, return **true**.

### Code

```java
class Solution {
    public boolean checkOnesSegment(String s) {
        char[] chars = s.toCharArray();

        for(int i = 1; i < chars.length; i++) {
            if(chars[i - 1] == '0' && chars[i] == '1')
                return false;
        }

        return true;
    }
}
```

### Time Complexity
```
O(n)
```

We traverse the string only once.

### Space Complexity
```
O(n)
```

Because the string is converted into a character array.
