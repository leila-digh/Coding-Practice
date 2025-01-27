## HackerRank - Time Conversion

**Solved**: 22 Jan 2025

### Problem:

Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Example:

* `12:01:00PM` →`12:01:00`
* `12:01:00AM` →`00:01:00`
* `01:01:00PM` →`13:01:00`

Find a link to the full problem specification [here](https://www.hackerrank.com/challenges/time-conversion/problem)

### My solution:

I created a helper function to check if the time is PM or AM

If the string indicates that it's PM and the hour is not 12, add 12  to the hour (so 1pm becomes 13:00)

If the time is AM, and it's 12 AM, set the hour to 00:00.
