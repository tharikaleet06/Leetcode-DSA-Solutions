# 18. 4Sum

## Problem

Given an integer array `nums` and an integer `target`, find all unique quadruplets `[nums[i], nums[j], nums[l], nums[r]]` such that:

```text
nums[i] + nums[j] + nums[l] + nums[r] = target
```

Return all unique quadruplets.

## Approach

First, sort the array.

Then fix the first two elements using two loops:

* `i` fixes the first element.
* `j` fixes the second element.
* `l` starts at `j + 1`.
* `r` starts at the end.

For each pair of fixed elements, use **Two Pointers** to find the remaining two elements.

Calculate:

```text
sum = nums[i] + nums[j] + nums[l] + nums[r]
```

### Pointer Movement

* If `sum == target` → add the quadruplet.
* If `sum > target` → move `r` backward.
* If `sum < target` → move `l` forward.

Duplicate values are skipped for `i`, `j`, `l`, and `r` to avoid duplicate quadruplets.

## Why `long`?

The sum is stored as a `long`:

```java
long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];
```

This prevents **integer overflow** when the array contains very large positive or negative values.

## Example

```text
Input:
nums = [1,0,-1,0,-2,2]
target = 0
```

After sorting:

```text
[-2,-1,0,0,1,2]
```

Output:

```text
[
  [-2,-1,1,2],
  [-2,0,0,2],
  [-1,0,0,1]
]
```

## Key Idea

**Fix two elements + Two Pointers for the remaining two elements.**

4Sum is an extension of the **3Sum pattern**.

```text
3Sum  → Fix 1 + Two Pointers
4Sum  → Fix 2 + Two Pointers
```

## Complexity

* **Time:** O(n³)
* **Space:** O(1) auxiliary space (excluding the output and sorting implementation)

## Pattern

**Two Pointers → 4Sum / Multiple Pointers**
