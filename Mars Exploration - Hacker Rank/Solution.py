#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'marsExploration' function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING s as parameter.
#

def marsExploration(s):
    # Write your code here
    counter = 0;
    inputLength = len(s)
    s = s.upper();
    expectedResult = 'SOS' * inputLength;
    expectedResult = expectedResult[:inputLength]
    
    
    for i in range(inputLength):
        if (expectedResult[i] != s[i]):
            counter +=1
            
    return counter

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = marsExploration(s)

    fptr.write(str(result) + '\n')

    fptr.close()
