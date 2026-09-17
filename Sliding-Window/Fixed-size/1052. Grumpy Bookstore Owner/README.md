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

when th
