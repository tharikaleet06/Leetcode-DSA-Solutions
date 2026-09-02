# 167. Two Sum II - Input Array Is Sorted

## Problem

Given a **1-indexed sorted array** `numbers` and an integer `target`, find two numbers such that they add up to `target`.

Return the indices of the two numbers.

## Approach

Since the array is already **sorted**, we can use the **Two Pointer** technique.

* Set `i` at the beginning of the array.
* Set `j` at the end of the array.
* Calculate `sum = numbers[i] + numbers[j]`.

### How the pointers move

* If `sum == target`, return `i + 1` and `j + 1` because the problem uses **1-based indexing**.
* If `sum > target`, decrease `j` because we need a smaller sum.
* If `sum < target`, increase `i` because we need a larger sum.

Continue until `i < j`.

## Example

```text
numbers = [2, 7, 11, 15]
target = 9
```

Initial:

```text
i = 0 → 2
j = 3 → 15

2 + 15 = 17 > 9
→ j--
```

Now:

```text
2 + 11 = 13 > 9
→ j--
```

Now:

```text
2 + 7 = 9
→ Found
```

Output:

```text
[1, 2]
```

## Why Two Pointers?

The array is sorted, so we can decide which pointer to move based on the current sum.

This avoids checking every possible pair and reduces the time complexity from **O(n²)** to **O(n)**.

## Complexity

* **Time:** O(n)
* **Space:** O(1)

## Pattern

**Two Pointers → Sorted Array**
