package algorithms.Warmup;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/simple-array-sum/problem
public class SimpleArraySum {

    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for(int a : ar){
            sum = sum + a;
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[size];

        String[] items = scanner.nextLine().split(" ");

        for(int i = 0; i < size; i++){
            int n = Integer.parseInt(items[i].trim());
            ar[i] = n;
        }
        int result = simpleArraySum(ar);

        System.out.println(result);

    }
}
