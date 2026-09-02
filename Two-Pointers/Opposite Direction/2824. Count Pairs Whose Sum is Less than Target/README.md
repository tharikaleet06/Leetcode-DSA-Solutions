# 2824. Count Pairs Whose Sum Is Less Than Target

## Problem

Given a list of integers `nums` and an integer `target`, count the number of pairs `(i, j)` such that:

```text
i < j
nums[i] + nums[j] < target
```

Return the total number of valid pairs.

## Approach

First, sort the list.

Then use **Two Pointers**:

* `i` starts at the beginning.
* `j` starts at the end.
* Calculate `sum = nums[i] + nums[j]`.

### Case 1: `sum < target`

Because the array is sorted, if:

```text
nums[i] + nums[j] < target
```

then every element between `i + 1` and `j` can also form a valid pair with `nums[i]`.

Therefore, instead of checking each pair individually, we can directly add:

```text
j - i
```

to the count.

Then move `i` forward.

### Case 2: `sum >= target`

The sum is too large, so decrease `j` to get a smaller value.

## Example

```text
nums = [-1,1,2,3,1]
target = 2
```

After sorting:

```text
[-1,1,1,2,3]
```

Start:

```text
i = 0
j = 4

-1 + 3 = 2
```

Since `2` is not less than `target`:

```text
j--
```

Now:

```text
-1 + 2 = 1 < 2
```

So all elements between `i + 1` and `j` form valid pairs with `nums[i]`.

Number of pairs:

```text
j - i = 3
```

Add `3` to the count and move `i`.

Continue until `i >= j`.

## Key Insight

When:

```text
nums[i] + nums[j] < target
```

we don't need to check every pair individually.

Because the array is sorted:

```text
nums[i] + nums[i+1] < target
nums[i] + nums[i+2] < target
...
nums[i] + nums[j] < target
```

So there are exactly:

```text
j - i
```

valid pairs.

## Complexity

* **Time:** O(n log n) — sorting + O(n) two-pointer traversal
* **Space:** O(1) auxiliary space apart from the sorting implementation

## Pattern

**Two Pointers → Sorted Array → Count Valid Pairs**
