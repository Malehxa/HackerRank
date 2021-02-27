package algorithms.Implementation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

// https://www.hackerrank.com/challenges/the-birthday-bar/problem
public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0, tmp = 0;

        for(int i = 0; i <= (s.size()-m); i++){
            for(int j = 0; j < m; j++){
                tmp = tmp + s.get(i+j);
            }
            if(tmp == d){
                count++;
            }
            tmp = 0;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        System.out.println(result);

        bufferedReader.close();
    }
}
