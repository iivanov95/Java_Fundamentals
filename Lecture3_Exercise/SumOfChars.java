package Lecture3_Exercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += symbol; //Тук можем направо да добавим симола към sum тъй като
                           //му взимаме ASCII кода при аритметични операции
        }
        System.out.printf("The sum equals: %d", sum);
    }
}