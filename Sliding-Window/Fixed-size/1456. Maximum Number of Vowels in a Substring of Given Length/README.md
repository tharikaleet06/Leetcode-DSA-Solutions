# 1456. Maximum Number of Vowels in a Substring of Given Length

## Problem

Given a string `s` and an integer `k`, return the **maximum number of vowels** in any substring of `s` with length `k`.

Vowels are:

```text
a, e, i, o, u
```

## Approach

Use a **Fixed-Size Sliding Window**.

First, count the vowels in the first `k` characters. Then slide the window through the string.

For every new window:

* Add the new character entering the window.
* Remove the character leaving the window.
* Update the maximum vowel count.

### Sliding Window

```text
count += incoming vowel
count -= outgoing vowel
```

In the code:

```text
count++
```

when the incoming character is a vowel, and

```text
count--
```

when the outgoing character is a vowel.

## Example

```text
Input:
s = "abciiidef"
k = 3
```

Windows:

```text
"abc" → 1 vowel
"bci" → 1 vowel
"cii" → 2 vowels
"iii" → 3 vowels
"iid" → 2 vowels
"ide" → 2 vowels
"def" → 1 vowel
```

```text
Output:
3
```

The substring `"iii"` contains the maximum number of vowels.

## Key Idea

Because the substring length is always **exactly `k`**, use a fixed-size window.

Instead of recounting all `k` characters for every substring:

```text
First window → count vowels
       ↓
Slide window
       ↓
Add incoming character
       ↓
Remove outgoing character
       ↓
Update maximum
```

This avoids repeatedly scanning the same characters.

## Complexity

* **Time:** O(n)
* **Space:** O(1)

## Pattern

**Sliding Window → Fixed Size → Maximum Count**

### Recognition Keywords

Look for:

* substring of length `k`
* exactly `k` elements
* fixed window
* maximum count
* count vowels / characters / occurrences
* add one element and remove one element

These are strong signals for a **Fixed-Size Sliding Window**.
