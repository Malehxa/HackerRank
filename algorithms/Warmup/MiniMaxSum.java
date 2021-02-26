package algorithms.Warmup;

import java.util.*;

// https://www.hackerrank.com/challenges/mini-max-sum/problem
public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long max = 0;
        long min = 0;
        long sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = 0;
            for(int j = 0; j < arr.length; j++){
                sum = sum + arr[j];
            }
            sum = sum - arr[i];
            if(sum > max){
                max = sum;
            }
            if(min == 0){
                min = sum;
            }
            if (sum < min){
                min = sum;
            }
        }

        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
