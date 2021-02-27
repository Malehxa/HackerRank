package algorithms.Implementation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

// https://www.hackerrank.com/challenges/between-two-sets/problem
public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        //kgV for list a
        int kgV = a.get(0);
        for(int i = 1; i < a.size(); i++){
            kgV = kgV(kgV, a.get(i));
        }

        //ggT for list b
        int ggT = b.get(0);
        for(int i = 1; i < b.size(); i++){
            ggT = ggT(ggT, b.get(i));
        }

        //count numbers of multiples of the kgV, which are factors auf the ggT
        int count = 0;
        for(int i = kgV, j = 1; i <= ggT; i = j*kgV){
            if(ggT%i ==0){
                count++;
            }
            j++;
        }
        return count;
    }

    private static int ggT(int x, int y){
        if(x == 0){
            return y;
        }
        return ggT(y%x, x);
    }

    private static int kgV(int a, int b){
        return a*b/ggT(a,b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = getTotalX(arr, brr);

        System.out.println(total);

        bufferedReader.close();
    }
}
