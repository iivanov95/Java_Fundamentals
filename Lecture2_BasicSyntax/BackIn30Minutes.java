package Lecture2_BasicSyntax;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int sumMin = (hours * 60) + min + 30;
        int resultHours = sumMin / 60;
        int resultMin = sumMin % 60;
        if (resultHours > 23) {
            resultHours = 0;
        }
        System.out.printf("%d:%02d", resultHours, resultMin);
    }
}