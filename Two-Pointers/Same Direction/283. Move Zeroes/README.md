# 283. Move Zeroes

## Problem

Given an integer array `nums`, move all `0`s to the end of the array while maintaining the relative order of the non-zero elements.

The operation must be performed **in-place**.

## Approach

We use **Two Pointers**:

* `j` scans through the entire array.
* `i` keeps track of the position where the next non-zero element should be placed.

Whenever `nums[j]` is non-zero:

1. Swap `nums[i]` and `nums[j]`.
2. Increment `i`.

This moves every non-zero element toward the front while pushing zeroes toward the end.

## Example

```text
Input:
nums = [0,1,0,3,12]
```

As `j` scans the array:

```text
[0,1,0,3,12]
 ↑
 i,j

1 is non-zero → swap with nums[i]

[1,0,0,3,12]
   ↑
   i
```

Continue scanning:

```text
[1,3,0,0,12]
```

Then:

```text
[1,3,12,0,0]
```

Output:

```text
[1,3,12,0,0]
```

## Why Two Pointers?

`j` is responsible for **finding non-zero elements**, while `i` is responsible for **placing them in the correct position**.

This allows us to solve the problem without using an extra array.

## Complexity

* **Time:** O(n)
* **Space:** O(1)

## Pattern

**Two Pointers → In-Place Array Modification**
