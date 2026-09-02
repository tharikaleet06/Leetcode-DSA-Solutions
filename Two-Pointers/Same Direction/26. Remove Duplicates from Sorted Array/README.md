# 26. Remove Duplicates from Sorted Array

## Problem

Given a sorted integer array `nums`, remove the duplicates **in-place** so that each unique element appears only once.

Return the number of unique elements `k`.

The first `k` positions of `nums` should contain the unique elements.

## Approach

Since the array is **sorted**, duplicate elements are next to each other.

We use **Two Pointers**:

* `i` keeps track of the position of the last unique element.
* `j` scans through the array to find the next unique element.

### How it works

* Start `i` at `0`.
* Start `j` at `1`.
* If `nums[j] != nums[i]`, we found a new unique element.

  * Increment `i`.
  * Place `nums[j]` at `nums[i]`.
* Move `j` forward after every comparison.

At the end, the number of unique elements is `i + 1`.

## Example

```text
Input:
nums = [1,1,2,2,3]

i = 0
j = 1

1 == 1 → duplicate → j++

1 != 2 → i++, nums[i] = 2

2 == 2 → duplicate → j++

2 != 3 → i++, nums[i] = 3
```

The array becomes:

```text
[1,2,3,2,3]
```

Only the first `3` elements matter.

```text
k = 3
```

## Why Two Pointers?

Because the array is sorted, duplicates are always adjacent.

Therefore, we don't need extra space such as a `HashSet`. We can overwrite duplicate positions while scanning the array.

## Complexity

* **Time:** O(n)
* **Space:** O(1)

## Pattern

**Two Pointers → In-Place Array Modification → Sorted Array**
