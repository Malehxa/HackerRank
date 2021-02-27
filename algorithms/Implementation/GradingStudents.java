package algorithms.Implementation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

// https://www.hackerrank.com/challenges/grading/problem
public class GradingStudents {

        public static List<Integer> gradingStudents(List<Integer> grades) {

            List<Integer> result = new LinkedList<>();
            int grade = 0;

            for(int g : grades){
                grade = ((g/5)*5)+5;

                if( g < 38) {
                    result.add(g);
                } else if((grade - g) < 3){
                    result.add(grade);
                } else if((grade - g) == 3){
                    result.add(g);
                } else {
                    result.add(g);
                }
            }
            return result;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> result = gradingStudents(grades);

            result.stream()
                    .map(Object::toString)
                    .forEach(System.out::println);

            bufferedReader.close();
        }
}


