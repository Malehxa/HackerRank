package algorithms.Warmup;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

// https://www.hackerrank.com/challenges/compare-the-triplets/problem
public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> solution = new ArrayList<Integer>();
        int aSol = 0;
        int bSol = 0;

        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                aSol++;
            } else if(a.get(i) < b.get(i)){
                bSol++;
            }
        }

        solution.add(0, aSol);
        solution.add(1, bSol);

        return solution;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        result.forEach(i -> System.out.print(i +" "));

        bufferedReader.close();
    }
}
