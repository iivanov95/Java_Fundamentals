package Lecture4_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" "); //[51 47 32 61 21]
        int countRotation = Integer.parseInt(scanner.nextLine());
        for (int rotation = 1; rotation <= countRotation; rotation++) {
            //взимаме първия елемент
            String firstElement = array[0]; //"51"
            //преместваме другите елементи наляво
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            //поставяме първия на последно място
            array[array.length - 1] = firstElement;
        }
        //Приключваме с ротациите и принтираме елементите на масива
        for (String element : array) {
            System.out.print(element + " ");
        }
        //Принтирането може и със:
        //System.out.println(String.join(" ", array));
        //тази функция работи само с масиви от текстове!!!
    }
}