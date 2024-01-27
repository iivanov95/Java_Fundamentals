package MidExamPreparation;

import java.util.Scanner;

public class FirstEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countLectures = Integer.parseInt(scanner.nextLine());
        int initialBonusPoints = Integer.parseInt(scanner.nextLine());
        // {total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
        double maxBonus = 0;
        int maxAttendance = 0;
        for (int i = 0; i < countStudents; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());

            double currentBonus = attendances * 1.0 / countLectures * (5 + initialBonusPoints);
            if (currentBonus > maxBonus) {
                maxBonus = currentBonus;
                maxAttendance = attendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendance);
    }
}