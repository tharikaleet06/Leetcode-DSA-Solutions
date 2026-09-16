# 643. Maximum Average Subarray I

## Problem

Given an integer array `nums` and an integer `k`, find the contiguous subarray of length `k` that has the **maximum average value**.

## Approach

Use a **Fixed-Size Sliding Window**.

Since every window has the same length `k`, maximizing the average is the same as maximizing the **sum** of the window.

### Steps

1. Calculate the sum of the first `k` elements.
2. Store it as the initial maximum sum.
3. Slide the window one position at a time.
4. Add the new element entering the window.
5. Subtract the element leaving the window.
6. Update the maximum sum.
7. Divide the maximum sum by `k` at the end.

### Sliding Window

For every new element:

```text
sum += nums[j]
sum -= nums[j-k]
```

This avoids recalculating the entire window sum each time.

## Example

```text
Input:
nums = [1,12,-5,-6,50,3]
k = 4

Windows:

[1, 12, -5, -6]      → sum = 2
[12, -5, -6, 50]     → sum = 51
[-5, -6, 50, 3]      → sum = 42

Maximum sum = 51

Maximum average = 51 / 4 = 12.75
```

```text
Output:
12.75000
```

## Key Idea

Because the window size is **fixed**, we don't need to calculate the average for every window.

Just find the **maximum window sum** and divide by `k` once at the end.

```text
Maximum Average
      ↓
Maximum Sum
      ↓
Fixed-Size Sliding Window
```

## Complexity

* **Time:** O(n)
* **Space:** O(1)

## Pattern

**Sliding Window → Fixed Size**

### Recognition Keyword

Look for:

* **contiguous subarray**
* **exactly `k` elements**
* **fixed window size**
* **maximum/minimum sum or average**

These are strong signals for a **Fixed-Size Sliding Window**.
