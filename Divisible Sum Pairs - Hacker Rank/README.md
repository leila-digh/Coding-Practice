## HackerRank - Divisible Sum Pairs

**Solved**: 25 Jan 2025

### Problem:

This task is to write a program that determines the number of pairs in a given array for which the sum is divisible by a given number



Find a link to the full problem specification [here](https://www.hackerrank.com/challenges/divisible-sum-pairs/problem)

### My solution:

I implemented this solution in Java. Here's a brief overview of my approach:

* Initialise a variable to keep track of the number of pairs
* Nested for loop to compare two indexes at a time
	example for the array `{10, 15, 3, 7}`
	it will compare these indexes `(10,15); (10,3); (10,7); (15,3); (15,7); (3,7);` … following this pattern
* if the indexes are divisible by said number, increment the counter
* Return the counter 
