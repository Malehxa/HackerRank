package algorithms.Implementation;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/drawing-book/problem
public class DrawingBook {

    static int pageCount(int n, int p) {

        int left = (p/2);
        int right = (n/2)-left;

        return (Math.min(left, right));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int result = pageCount(n, p);

        System.out.println(result);

        scanner.close();
    }
}
