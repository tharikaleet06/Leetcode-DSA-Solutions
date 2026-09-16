# 2379. Minimum Recolors to Get K Consecutive Black Blocks

## Problem

Given a string `blocks` containing `W` (White) and `B` (Black), find the minimum number of white blocks that need to be recolored to make **at least `k` consecutive blocks black**.

## Approach

Use a **Fixed-Size Sliding Window**.

For every window of size `k`, count how many `W` blocks it contains.

Every `W` in the window must be recolored to `B`, so:

```text
recolors = number of W's in the window
```

Therefore, we need to find the window of size `k` with the **minimum number of `W`s**.

### Steps

1. Count the number of `W`s in the first `k` blocks.
2. Store this as the initial minimum.
3. Slide the window one position at a time.
4. Add the new block entering the window.
5. Remove the block leaving the window.
6. Update the minimum number of white blocks.

### Sliding Window

```text
count += blocks[j] == 'W'
count -= blocks[j-k] == 'W'
```

The window always contains exactly `k` blocks.

## Example

```text
Input:
blocks = "WBBWWBBWBW"
k = 7
```

The first window is:

```text
WBBWWBB
```

It contains `3` white blocks.

Another window:

```text
BBWWBBW
```

It contains `3` white blocks.

The minimum number of white blocks in any window of size `7` is:

```text
3
```

```text
Output:
3
```

So, `3` white blocks need to be recolored to obtain `7` consecutive black blocks.

## Key Idea

We don't actually need to count the black blocks.

Instead:

```text
k consecutive black blocks
        ↓
Find a window of size k
        ↓
Count W's
        ↓
Minimum W's = Minimum Recolors
```

This turns the problem directly into a **minimum-count fixed-size sliding window** problem.

## Complexity

* **Time:** O(n)
* **Space:** O(1)

## Pattern

**Sliding Window → Fixed Size → Minimum Count**

### Recognition Keywords

Look for:

* contiguous substring/subarray
* exactly `k` elements
* fixed window size
* minimum changes
* minimum replacements
* count unwanted elements in each window
