package algorithms.Warmup;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/solve-me-first/problem
public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
