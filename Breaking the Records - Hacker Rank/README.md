## HackerRank - Breaking the Records Problem

**Solved**: 23 Jan 2024

### Problem:

The task is to findhow many times a player breaks their record for most points and least points in a season.

For example, for the array of scores `[10, 5, 20, 20, 4, 5, 2, 25, 1]` :

This player broke their record for;

* highest score `2` times
* lowest score `3` times

Find a link to the full problem specification [here](https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem)

### My solution:

I implemented this solution in Java. Here's a brief overview of my approach:

* I kept track of the current high and low score records.
* Looped through the array list starting from the second index and compared each score to the currrent high and low records.
* I update the current high and low scores accordingly and also update my output array values accordingly.
