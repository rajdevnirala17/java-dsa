# Java DSA Journal

## Day 1 - 26 Nov 2026
**Topics:** JDK + VS Code setup, Git/GitHub setup, Scanner input, if/else
- **Problems solved:** Hello DSA, Sum of two numbers, Even/Odd
- **What I learned:**
- println takes one argument; use + to join strings
- Scanner should be closed (or used with try-with-resources)
- Fixed a Git merge conflict with unrelated histories
- found a solution that to find Even Odd the number must be a natural number
- **Tomorrow:** Largest of three, loops (sum of N, factorial, table)

## Day 2 - 27 Nov 2026
**Topics:** Conditions, for loops, integer overflow, number problems
**Problems solved:** Even/Odd (rewritten from memory), Largest of three, Sum of 1 to N (loop and formula), Multiplication table
**What I learned:**
- Ties break `>` comparisons: `5 5 3` gave a wrong answer until I switched to `>=`
- Use `long` for sums and loop counters when values can get big
- The loop version of the sum is O(n), the formula is O(1)
- Always test edge cases: ties, 0, negatives
- Format Document in VS Code and the Scanner resource leak warning
**Tomorrow:** Factorial (overflow at 21!), count digits, reverse a number

## Day 3 - 28 Nov 2026
**Topics:** Factorial, overflow limits, guarding invalid input
**Problems solved:** Factorial of N
**What I learned:**
- Do the problem by hand first, then spot the pattern: a running result plus a loop
- Factorial starts at 1 (not 0) and uses `*` instead of `+`
- 20! is the largest factorial that fits in a `long`; 21! overflows, so I added a guard
- Handled edge cases: 0! = 1 and negative input
- **Tomorrow:** Count digits, reverse a number, palindrome, prime check

## Day 4 - 29-11-26
**Topics:** while loops, digit extraction with % and /, early exit with break
**Problems solved:** Count digits, Reverse a number, Palindrome number
**What I learned:**
- `n % 10` gives the last digit and `n / 10` removes it
- Reversing builds a running result: `reversed = reversed * 10 + last`
- The loop destroys `n`, so save a copy (`original`) before comparing for a palindrome
- Use `long` for reversed numbers to avoid overflow
- **Tomorrow:** Arrays basics, then Fibonacci or GCD