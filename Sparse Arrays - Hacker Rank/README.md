## HackerRank - Sparse Arrays

**Solved**: 26 Jan 2025

### Problem:

In this problem, there are two input arrays. 1 input array of strings and a second array of queries.
The task is to find the number of marching strings for each query

Finda a link to the full problem specification [here](https://www.hackerrank.com/challenges/sparse-arrays/problem)

### My solution:

Here's a brief overview of my approach in JAva:

* Initialise a variable to keeep track of the number of matching pairs for each query index
* Nested for loop to compare two indexes at a time
* If the string indexes are equal, increment the counter
* add the counter to the reesults array
* reset the counter
* return the results array
