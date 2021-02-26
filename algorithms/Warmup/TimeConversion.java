package algorithms.Warmup;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/time-conversion/problem
public class TimeConversion {

    static String timeConversion(String s) {
        String end = s.substring(s.length()-2);

        if(end.equals("PM") && !s.startsWith("12")){
            String first = s.substring(0,2);
            int hour = Integer.parseInt(first);
            hour = hour + 12;
            return hour + s.substring(2, s.length()-2);
        }
        else if(end.equals("PM") && s.startsWith("12")) {
            return "12" + s.substring(2, s.length()-2);
        }
        else if(end.equals("AM") && s.startsWith("12")){
            return "00" + s.substring(2, s.length()-2);
        }
        else {
            return s.substring(0,s.length()-2);
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
    }
}
