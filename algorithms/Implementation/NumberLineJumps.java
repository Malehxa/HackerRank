package algorithms.Implementation;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/kangaroo/problem
public class NumberLineJumps {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int sum1 = 0, sum2 = 0;

        if(x2 > x1 && v2 > v1){
            return "NO";
        } else {
            sum1 = x1 + v1;
            sum2 = x2 + v2;
            for (int i = 0; i < 10000; i++) {

                if(sum1 == sum2){
                    return "YES";
                }
                sum1 += v1;
                sum2 += v2;
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);
        int v1 = Integer.parseInt(x1V1X2V2[1]);
        int x2 = Integer.parseInt(x1V1X2V2[2]);
        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);

        scanner.close();
    }
}
