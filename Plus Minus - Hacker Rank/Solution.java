//HackerRank - PlusMinus Problem
//Solved 20 Jan 2024


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        if(arr.size() < 0 || arr.size() > 100){
            return;            
        }
        for(int i=0; i < arr.size(); i++){
            if(arr.get(i) < -100 || arr.get(i) > 100){
                return;  
            }
        }
        int countPos = 0;
        int countNeg = 0;
        int countZer = 0;
        
        for(int i=0; i < arr.size(); i++){
            if(arr.get(i)< 0){
                countNeg++;
            }
            if(arr.get(i)> 0){
                countPos++;
            }
            if(arr.get(i) == 0){
                countZer++;
            }
        }
        //proportion of:
        float propPos = (float)countPos/arr.size();
        float propNeg = (float)countNeg/arr.size();
        float propZer = (float)countZer/arr.size();
        
        
        System.out.printf("%.6f\n", propPos);
        System.out.printf("%.6f\n", propNeg);
        System.out.printf("%.6f\n", propZer);
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
