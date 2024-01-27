package Lecture10_TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        String[] parts = path.split("\\\\");
        String fullFilename = parts[parts.length - 1];
        String extension = fullFilename.split("\\.")[1];
        String filename = fullFilename.split("\\.")[0];

        System.out.println("File name: " + filename);
        System.out.println("File extension: " + extension);
    }
}