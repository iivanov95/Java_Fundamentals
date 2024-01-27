package Lecture4_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //Повтарящо се действие: въвеждане на команди
        //стоп: входни данни == "end"
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            //command != end - тоест е валидна команда
            //Валидни команди:
            //"swap {index1} {index2}"
            //"multiply {index1} {index2}"
            //"decrease"

            if (command.contains("swap")) {
                //моята команда е swap: command == "swap 2 4".split(" ") - > ["swap", "2", "4"]
                int index1 = Integer.parseInt(command.split(" ")[1]); //parse("2") -> 2
                int index2 = Integer.parseInt(command.split(" ")[2]); //parse("4") -> 4
                int firstIndexNum = numbers[index1];
                int secondIndexNum = numbers[index2];

                numbers[index1] = secondIndexNum;
                numbers[index2] = firstIndexNum;
            } else if (command.contains("multiply")) {
                //командата е multiply: command: "multiply 3 6".split(" ") - > ["multiply", "3", "6"]
                int index1 = Integer.parseInt(command.split(" ")[1]); //parse("3") -> 3
                int index2 = Integer.parseInt(command.split(" ")[2]); //parse("6") -> 6
                int firstIndexNum = numbers[index1];
                int secondIndexNum = numbers[index2];

                int product = firstIndexNum * secondIndexNum;
                numbers[index1] = product;

            } else if (command.equals("decrease")) {
                //командата е decrease
                //обхождаме всички и намаляме с 1
                for (int index = 0; index <= numbers.length - 1; index++) {
                    numbers[index]--;
                    //
                }
            }
            command = scanner.nextLine();
        }
        //отпечатваме числата от масива, разделени от ", "
        System.out.println(Arrays.toString(numbers)
                .replace("[","")
                .replace("]",""));
    }
}