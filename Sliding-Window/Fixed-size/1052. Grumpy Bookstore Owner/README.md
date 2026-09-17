Yep bro — this is **LeetCode 1052: Grumpy Bookstore Owner**. Your approach is a **Fixed-Size Sliding Window**, but with a nice twist: first calculate the customers who are **already satisfied**, then use the window to maximize the **additional customers saved**. ([LeetCode][1])

# 1052. Grumpy Bookstore Owner

## Problem

Given:

* `customers[i]` → number of customers entering at minute `i`
* `grumpy[i]` → `1` if the owner is grumpy, `0` otherwise
* `minutes` → number of consecutive minutes the owner can use a technique to avoid being grumpy

The technique can be used **only once**.

Return the maximum number of customers that can be satisfied.

## Approach

Use a **Fixed-Size Sliding Window**.

The solution is divided into two parts:

### 1. Count Already Satisfied Customers

When:

```text
grumpy[i] == 0
```

those customers are already satisfied, so add them directly to `sat`.

```text
sat += customers[i]
```

These customers do not depend on where the sliding window is placed.

### 2. Maximize Additional Satisfied Customers

When:

```text
grumpy[i] == 1
```

those customers are normally unsatisfied.

If the secret technique is applied during a window of `minutes`, all those customers become satisfied.

So the sliding window tracks the number of **additional customers that can be saved**.

```text
add += customers[i]
```

when the incoming minute is grumpy, and:

```text
add -= customers[i-minutes]
```

when the outgoing minute is grumpy.

Keep the maximum value of `add`.

Finally:

```text
answer = sat + max
```

## Example

```text
Input:
customers = [1,0,1,2,1,1,7,5]
grumpy    = [0,1,0,1,0,1,0,1]
minutes   = 3
```

Already satisfied customers:

```text
1 + 1 + 1 + 7 = 10
```

The best 3-minute window allows these otherwise-unsatisfied customers to become satisfied:

```text
1 + 7 + 5 = 13
```

Therefore:

```text
10 + 13 = 23
```

Wait — this calculation includes the wrong window relationship. For the actual optimal window, the satisfied total is:

```text
16
```

## Key Idea

Separate the problem into:

```text
Already satisfied customers
            +
Maximum extra customers from a window of size minutes
            =
Answer
```

The sliding window does **not** calculate total satisfaction directly.

It finds the maximum number of currently-unsatisfied customers that can be converted into satisfied customers.

```text
grumpy == 1
     ↓
Potentially recoverable customers
     ↓
Fixed-size window
     ↓
Maximum recoverable customers
```

## Complexity

* **Time:** O(n)
* **Space:** O(1)

## Pattern

**Sliding Window → Fixed Size → Maximum Gain**

### Recognition Keywords

Look for:

* exactly `k` / `minutes` consecutive elements
* technique can be used for a fixed duration
* maximize additional benefit
* already valid/satisfied values + extra gain
* choose the best window
* maximize sum inside a fixed window

This is a common **"baseline + maximum window gain"** sliding-window pattern.

[1]: https://leetcode.doocs.org/en/lc/1052/?utm_source=chatgpt.com "1052. Grumpy Bookstore Owner - LeetCode Wiki"
