#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'diagonalDifference' function below.
#
# The function is expected to return an INTEGER.
# The function accepts 2D_INTEGER_ARRAY arr as parameter.
#

def diagonalDifference(arr):
    # Write your code here
    length = len(arr)
    L2Rdiag = 0
    R2Ldiag = 0
    absoluteDiff = 0
    for i in range (length):
        L2Rdiag += arr[i][i]
        
    for i in range (length):
        R2Ldiag += arr[i][length- 1 - i]
    
    absoluteDiff = abs(L2Rdiag-R2Ldiag)
    
    return absoluteDiff
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
