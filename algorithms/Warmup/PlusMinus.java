package algorithms.Warmup;

import java.util.*;

// https://www.hackerrank.com/challenges/plus-minus/problem
public class PlusMinus {

    static void plusMinus(int[] arr) {

        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int el : arr) {
            if (el > 0) {
                pos++;
            } else if (el < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        if (pos != 0) {
            System.out.println((double)pos / (double)arr.length);
        } else {
            System.out.println(0.000000);
        }
        if (neg != 0) {
            System.out.println((double)neg / (double)arr.length);
        } else {
            System.out.println(0.000000);
        }
        if (zero != 0) {
            System.out.println((double)zero / (double)arr.length);
        } else {
            System.out.println(0.000000);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
