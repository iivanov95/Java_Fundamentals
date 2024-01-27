package Lecture10_TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine(); //"923847238931983192462832102"
        String secondInput = scanner.nextLine(); //"4"

        BigInteger firstNumber = new BigInteger(firstInput);
        byte secondNumber = Byte.parseByte(secondInput);

        System.out.println(firstNumber.multiply(new BigInteger(secondNumber + "")));
    }
}