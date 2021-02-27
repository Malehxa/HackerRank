package algorithms.Implementation;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
public class BreakingTheRecords {

    static int[] breakingRecords(int[] scores) {

        int max = scores[0];
        int min = scores[0];
        int count_min = 0;
        int count_max = 0;
        int[] result = new int[2];

        for(int i : scores){

            if(i > max){
                max = i;
                count_max++;
            }
            if(i < min){
                min = i;
                count_min++;
            }
        }

        result[0] = count_max;
        result[1] = count_min;

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}
