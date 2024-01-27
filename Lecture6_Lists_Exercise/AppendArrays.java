package Lecture6_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("|"))
                             .map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < numbers.size(); i++) {

        }
    }
}
