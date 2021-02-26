package algorithms.Warmup;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

// https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        Integer max = 0;
        for(Integer el : candles){
            if (el > max){
                max = el;
            }
        }
        int count = 0;
        for(Integer ele : candles){
            if(ele.equals(max)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = birthdayCakeCandles(candles);

        System.out.println(result);

        bufferedReader.close();
    }
}
