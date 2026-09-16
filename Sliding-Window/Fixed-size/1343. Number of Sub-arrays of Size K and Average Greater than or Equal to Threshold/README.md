# 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

## Problem

Given an integer array `arr`, an integer `k`, and a `threshold`, count the number of contiguous subarrays of size `k` whose average is greater than or equal to `threshold`.

## Approach

Use a **Fixed-Size Sliding Window**.

Instead of calculating the average for every window, convert the condition:

```text
average >= threshold
```

into:

```text
sum >= threshold * k
```

This avoids unnecessary division.

### Steps

1. Calculate the required sum:

```text
t = threshold * k
```

2. Calculate the sum of the first `k` elements.
3. Check whether the first window satisfies the condition.
4. Slide the window one position at a time.
5. Add the new element entering the window.
6. Remove the element leaving the window.
7. If the new window sum is at least `t`, increment `count`.

### Sliding Window

```text
sum += arr[j]
sum -= arr[j-k]
```

The window always contains exactly `k` elements.

## Example

```text
Input:
arr = [2,2,2,2,5,5,5,8]
k = 3
threshold = 4
```

Required sum:

```text
threshold * k
= 4 * 3
= 12
```

Valid windows:

```text
[2,5,5] → sum = 12
[5,5,5] → sum = 15
[5,5,8] → sum = 18
```

```text
Output:
3
```

## Key Idea

When the window size is fixed at `k`:

```text
average >= threshold
```

is equivalent to:

```text
sum >= threshold * k
```

So we only need to maintain the **window sum** and count how many windows satisfy the required sum.

```text
Fixed Window
     ↓
Maintain Sum
     ↓
Compare with threshold × k
     ↓
Count Valid Windows
```

## Complexity

* **Time:** O(n)
* **Space:** O(1)

## Pattern

**Sliding Window → Fixed Size**

### Recognition Keywords

Look for:

* contiguous subarray
* exactly `k` elements
* fixed size
* count valid windows
* maximum/minimum/average over every `k` elements
* threshold condition

These are strong signals for a **Fixed-Size Sliding Window**.
