## HackerRank - CamelCase

**Solved**: 24 Jan 2025

### Problem:

The task is to write a program to either split camel case string or combine words into camel case string.

Each line of input will begin with either S or C; indicate split or combine followed by

M, C or V indicating method, class or variable

Find a link to the full problem specification [here](https://www.hackerrank.com/challenges/three-month-preparation-kit-camel-case/problem)

### My solution:

I implemented this solution in Python. Here's a brief overview of my approach:

* I had helper functions to check if it was a string to be split or combined
* In the split function, I converted all the characters to lowercase and removed the parentheses if it's a method
* In the combine function if it's a method, I appended parentheses
