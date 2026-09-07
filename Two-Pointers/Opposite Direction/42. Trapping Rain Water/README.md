# 42. Trapping Rain Water

## Problem

Given an array `height` where each element represents the height of a bar, calculate how much rainwater can be trapped between the bars.

## Approach

Use the **Two Pointer** technique with two variables to keep track of the maximum heights from both sides.

* `l` starts from the left.
* `r` starts from the right.
* `lm` stores the maximum height seen from the left.
* `rm` stores the maximum height seen from the right.
* `water` stores the total trapped water.

### Pointer Movement

Compare `height[l]` and `height[r]`.

#### If `height[l] < height[r]`

Process the left side.

* If `height[l] >= lm`, update `lm`.
* Otherwise, water trapped is:

```text
lm - height[l]
```

Then move `l` forward.

#### Otherwise

Process the right side.

* If `height[r] >= rm`, update `rm`.
* Otherwise, water trapped is:

```text
rm - height[r]
```

Then move `r` backward.

## Example

```text
Input:
height = [0,1,0,2,1,0,1,3,2,1,2,1]

Output:
6
```

The total amount of trapped rainwater is `6`.

## Key Idea

For each position, the trapped water depends on the maximum height on its left and right.

The usual formula is:

```text
water = min(leftMax, rightMax) - height[i]
```

Instead of storing `leftMax` and `rightMax` arrays, we maintain them using two variables:

```text
lm → left maximum
rm → right maximum
```

This allows the problem to be solved **in-place with constant extra space**.

## Complexity

* **Time:** O(n)
* **Space:** O(1)

## Pattern

**Two Pointers → Opposite Direction**
