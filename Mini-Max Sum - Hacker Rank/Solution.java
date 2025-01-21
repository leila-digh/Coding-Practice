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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int n = arr.size();
    long minSum = Long.MAX_VALUE;
    long maxSum = 0;
    
    for (int i=0; i<n; i++){
        long current = sumArrayExcept(arr, i);
        
        if(current < minSum){
            minSum = current;
        }

        if(current > maxSum){
            maxSum = current ;
        }
        
    }
    
    System.out.print(minSum + " ");
    System.out.print(maxSum);
}
    
    public static long sumArrayExcept(List<Integer> arr, int index){
    int n = arr.size();
    long sum = 0;
    
    for (int i=0; i<n; i++){
        if (i != index) {
            sum += arr.get(i);
        }    
    }

    return sum;
}


}





public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

