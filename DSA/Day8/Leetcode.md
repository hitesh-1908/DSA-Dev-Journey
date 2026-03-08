# Search Insert Position (Easy)

Today I solved a **Binary Search problem** where we need to determine the correct position of a target element in a sorted array.

The problem states that if the **target element exists**, we return its index. Otherwise, we return the **index where it should be inserted** to maintain the sorted order of the array.

### Approach

My approach was based on the **standard Binary Search algorithm**.

1. Initialize two pointers:

   * `start = 0`
   * `end = nums.length - 1`

2. Run a loop while `start <= end`.

3. Calculate the middle index:

```
mid = (start + end) / 2
```

4. Compare the middle element with the target.

* If `nums[mid] == target`, return `mid`.
* If `nums[mid] < target`, move the `start` pointer to `mid + 1`.
* If `nums[mid] > target`, move the `end` pointer to `mid - 1`.

5. During a dry run with the array `{1,3,5,8}` and `target = 10`, I noticed something interesting.

When the target element does **not exist in the array**, the loop ends when:

```
start > end
```

At this point, the **start pointer represents the correct position where the target should be inserted**.

So instead of returning `-1`, we return `start`.

### Code

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end)
        {
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                // value of target greater than the value at index mid
                start = mid + 1;
            }
            else{
                // value of target is less than the value at index mid
                end = mid - 1;
            }         
        }

        return start;
    }
}
```

### Time Complexity

```
O(log n)
```

Binary search reduces the search space by half in each iteration.

### Space Complexity

```
O(1)
```

No extra space is used apart from a few variables.
