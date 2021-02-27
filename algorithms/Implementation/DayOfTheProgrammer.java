package algorithms.Implementation;

import java.io.*;

// https://www.hackerrank.com/challenges/day-of-the-programmer/problem
public class DayOfTheProgrammer {

    static String dayOfProgrammer(int year) {
        int months = 31+31+30+31+30+31+31; //first 8 month without february

        if(year == 1918){
            months = 230;
        }
        else if(year < 1918) {
            if (year % 4 == 0) {
                months += 29;
            } else {
                months += 28;
            }
        }
        else {
            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                months += 29;
            } else {
                months += 28;
            }
        }
        int day = 256 - months;

        return day +".09." +year;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        System.out.println(result);

        bufferedReader.close();
    }
}


