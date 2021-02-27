package algorithms.Implementation;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int counter = 0;
        int tmp = 0;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                tmp = ar[i] + ar[j];
                if(tmp%k == 0){
                    counter++;
                }
            }
        }
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);

        System.out.println(result);

        scanner.close();
    }
}
