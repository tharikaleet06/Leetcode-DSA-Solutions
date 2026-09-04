# 15. 3Sum

## Problem

Given an integer array `nums`, find all unique triplets `[nums[i], nums[l], nums[r]]` such that:

```text
nums[i] + nums[l] + nums[r] = 0
```

Return all unique triplets.

## Approach

First, sort the array.

Then use **Two Pointers** for every fixed element.

* `i` fixes the first element.
* `l` starts at `i + 1`.
* `r` starts at the end of the array.

Calculate:

```text
sum = nums[i] + nums[l] + nums[r]
```

### Cases

* If `sum == 0` → add the triplet to the answer.
* If `sum > 0` → decrease `r` to reduce the sum.
* If `sum < 0` → increase `l` to increase the sum.

Because duplicates can produce the same triplet, duplicate values are skipped for `i`, `l`, and `r`.

## Example

```text
Input:
nums = [-1,0,1,2,-1,-4]

After sorting:
[-4,-1,-1,0,1,2]

Output:
[[-1,-1,2],[-1,0,1]]
```

## Key Idea

**Fix one element + apply Two Pointers to the remaining sorted array.**

This makes 3Sum a **Two Pointers variation** rather than a completely separate pattern.

## Complexity

* **Time:** O(n²)
* **Space:** O(1) auxiliary space (excluding the output)

## Pattern

**Two Pointers → Multiple Pointers / 3Sum**
