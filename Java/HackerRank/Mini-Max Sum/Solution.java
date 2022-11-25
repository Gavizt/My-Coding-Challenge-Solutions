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
        ArrayList<Integer> array = (ArrayList<Integer>) arr;
        
        array.sort(null);
        
        Long minimumSum = 0L;
        for (int i = 0; i < array.size() - 1; i++) {
            minimumSum += array.get(i);
        }
        
        Long maximumSum = 0L;
        for (int i = array.size() - 1; i > 0; i--) {
            maximumSum += array.get(i);
        }
        
        System.out.printf("%d %d", minimumSum, maximumSum);
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
