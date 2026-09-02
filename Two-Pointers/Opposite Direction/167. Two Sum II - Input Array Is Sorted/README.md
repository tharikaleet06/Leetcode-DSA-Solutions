# 167. Two Sum II - Input Array Is Sorted

## Problem

Given a 1-indexed sorted array `numbers` and an integer `target`,
find two numbers such that they add up to `target`.

Return their indices.

## Approach

Since the array is sorted, we use the **Two Pointer** technique.

- `left` starts from the beginning.
- `right` starts from the end.
- Calculate `sum = numbers[left] + numbers[right]`.

If:

- `sum == target` → answer found.
- `sum < target` → increase `left` to get a larger sum.
- `sum > target` → decrease `right` to get a smaller sum.

### Example

```text
numbers = [2,7,11,15]
target = 9

2 + 15 = 17  → move right
2 + 11 = 13  → move right
2 + 7  = 9   → found
