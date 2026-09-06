# 16. 3Sum Closest

## Problem

Given an integer array `nums` and an integer `target`, find three integers in `nums` whose sum is closest to `target`.

Return the sum of the three integers.

## Approach

First, sort the array.

Then use **Two Pointers** for each fixed element.

* `i` fixes the first element.
* `l` starts from `i + 1`.
* `r` starts from the end.

Calculate:

```text
sum = nums[i] + nums[l] + nums[r]
```

Keep track of the sum that has the smallest difference from `target`.

### Pointer Movement

* If `sum == target`, return immediately because this is the closest possible sum.
* If `sum < target`, move `l` forward to increase the sum.
* If `sum > target`, move `r` backward to decrease the sum.

The closest sum is updated using:

```text
Math.abs(target - sum) < Math.abs(target - closest)
```

## Example

```text
Input:
nums = [-1,2,1,-4]
target = 1
```

After sorting:

```text
[-4,-1,1,2]
```

Possible closest sum:

```text
-1 + 1 + 2 = 2
```

Output:

```text
2
```

Because `2` has the smallest difference from `1`.

## Key Idea

**Fix one element + Two Pointers + Track the closest sum.**

This is a variation of **3Sum** where instead of finding an exact sum of `0`, we find the sum closest to a given `target`.

## Complexity

* **Time:** O(n²)
* **Space:** O(1) auxiliary space (excluding the sorting implementation)

## Pattern

**Two Pointers → 3Sum Variation → Closest Sum**
