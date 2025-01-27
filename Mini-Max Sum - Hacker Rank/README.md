## HackerRank - Mini-Max Problem

**Solved**: 21 Jan 2025

### Problem:

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

For example, for the array `[1, 3, 5, 7, 9]` , the minmum value would be: 16 ; the maximum value would be: 24.

Find a link to the full problem specification [here](https://www.hackerrank.com/challenges/mini-max-sum/problem)

### My solution:

I created a helper function to calculate the sum of each index except one

Since the problem explicitly warns about potential integer overflow, I used `long`

I initialised two variables to track the results of the helper function

This specification is not particular about time complexity and the input is only limited to 5 elements. However taking a different approach without nested for loops, like i have, will be more efficient for larger input arrays
