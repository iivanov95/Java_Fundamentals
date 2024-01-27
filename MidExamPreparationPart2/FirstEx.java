package MidExamPreparationPart2;

import java.util.Scanner;

public class FirstEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int totalStudentsPerHour = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;

        int hoursNeeded = 0;

        while (studentsCount > 0) {
            hoursNeeded++;
            if (hoursNeeded % 4 == 0) {
                continue;
            }
            studentsCount -= totalStudentsPerHour;

        }
        System.out.printf("Time needed: %dh.", hoursNeeded);
    }
}