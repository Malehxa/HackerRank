package algorithms.Implementation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

// https://www.hackerrank.com/challenges/migratory-birds/problem
public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {
        int size = 0;
        for(Integer s : arr){
            if(size < s){
                size = s;
            }
        }

        int[] counter = new int[size+1];

        for (Integer el: arr) {
            counter[el]++;
        }

        int max = 0;
        for(int x : counter){
            if(max < x){
                max = x;
            }
        }

        int index = 0;
        for (int i = 0; i < counter.length; i++){
            if(counter[i] == max){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);

        System.out.println(result);

        bufferedReader.close();
    }
}
