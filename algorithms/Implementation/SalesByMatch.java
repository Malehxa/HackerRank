package algorithms.Implementation;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/sock-merchant/problem
public class SalesByMatch {

    static int sockMerchant(int n, int[] ar) {

        int counter = 0;
        List<Integer> mapping = new LinkedList<>();

        for(int value : ar) {
          if(!mapping.contains(value)){
              mapping.add(value);
          } else {
              counter++;
              mapping.remove((Integer) value);
          }
        }
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);

        scanner.close();
    }
}





