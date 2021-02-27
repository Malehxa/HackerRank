package algorithms.Implementation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

// https://www.hackerrank.com/challenges/bon-appetit/problem
public class BillDivision {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int calc = 0;
        int wrong = 0;

        for(int i = 0; i < bill.size(); i++){
            wrong += bill.get(i);
            if(i != k){
                calc += bill.get(i);
            }
        }

        calc = calc/2;
        wrong = wrong/2;

        if(calc == b){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(wrong-calc);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
