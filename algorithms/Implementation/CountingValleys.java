package algorithms.Implementation;

import java.io.*;

// https://www.hackerrank.com/challenges/counting-valleys/problem
public class CountingValleys {

    public static int countingValleys(int steps, String path) {

        String[] pathSteps = path.split("");
        int up = 0;
        int down = 0;
        boolean valley = false;
        int counter = 0;

        for(String s : pathSteps){
            if(s.equals("U")){
                up++;
            } else {
                down++;
            }

            if((up - down) < 0){
                valley = true;
            }

            if(valley && (up - down) == 0){
                counter++;
                up = 0;
                down = 0;
                valley = false;
            }
        }

        return counter;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = countingValleys(steps, path);

        System.out.println(result);

        bufferedReader.close();

    }
}
