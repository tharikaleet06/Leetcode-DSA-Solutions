# 11. Container With Most Water

## Problem

Given an integer array `height`, where each element represents the height of a vertical line, find two lines that together with the x-axis form a container that holds the most water.

Return the maximum amount of water the container can store.

## Approach

Use the **Two Pointer** technique.

* `l` starts at the beginning.
* `r` starts at the end.
* The width of the container is `r - l`.
* The height of the container is the smaller of `height[l]` and `height[r]`.

The amount of water is:

```text
min(height[l], height[r]) × (r - l)
```

Keep track of the maximum area found.

### Pointer Movement

The container is limited by the **shorter line**.

* If `height[l] < height[r]`, move `l` forward.
* Otherwise, move `r` backward.

We move the shorter side because moving the taller side cannot increase the limiting height.

## Example

```text
height = [1,8,6,2,5,4,8,3,7]
```

The maximum container is formed by heights `8` and `7`.

```text
Area = min(8,7) × width
     = 7 × 7
     = 49
```

Output:

```text
49
```

## Key Idea

Start with the **maximum possible width** and gradually reduce the width.

At every step, move the pointer pointing to the **shorter height** because that is the limiting factor.

## Complexity

* **Time:** O(n)
* **Space:** O(1)

## Pattern

**Two Pointers → Opposite Direction**
