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
        
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        for (int i : arr) {            
            positiveCount += (i > 0) ? 1 : 0;
            negativeCount += (i < 0) ? 1 : 0;
            zeroCount += (i == 0) ? 1 : 0;
        }
        
        double positiveRatio = (double)positiveCount / (double)arr.size();
        double negativeRatio = (double)negativeCount / (double)arr.size();
        double zeroRatio = (double)zeroCount / (double)arr.size();
        
        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zeroRatio);

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
