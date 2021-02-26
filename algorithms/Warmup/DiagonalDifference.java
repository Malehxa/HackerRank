package algorithms.Warmup;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
import static oracle.jrockit.jfr.events.Bits.intValue;

// https://www.hackerrank.com/challenges/diagonal-difference/problem
public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int firstSum = 0;
        int secSum = 0;

        for(int i = 0; i < arr.size(); i++){
            firstSum = firstSum + intValue(arr.get(i).get(i));
        }

        int j = arr.size()-1;

        for(int i = 0; i < arr.size(); i++){
            secSum = secSum + intValue(arr.get(i).get(j));
            j--;
        }

        int sum = firstSum - secSum;

        if(sum < 0){
            sum *= -1;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);

        System.out.println(result);

        bufferedReader.close();
    }
}
