package Lecture6_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> topics = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] commandParts = command.split(":");
            String commandName = commandParts[0];
            String topic = commandParts[1];
            switch (commandName) {
                case "Add":
                    if (!topics.contains(topic)) {
                        topics.add(topic);
                    }
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(commandParts[2]);
                    if (!topics.contains(topic)) {
                        topics.add(indexToInsert, topic);
                    }
                    break;
                case "Remove":
                    if (topics.contains(topic)) {
                        int currentIndex = topics.indexOf(topic);
                        String exercise = topic + "-Exercise";

                        boolean hasExercise = topics.get(currentIndex + 1).equals(exercise) && currentIndex != topics.size() - 1;
                        topics.remove(topic);

                        if (hasExercise) {
                            topics.remove(exercise);
                        }
                    }
                    break;
                case "Swap":
                    String secondTopic = commandParts[2];

                    if (topics.contains(topic) && topics.contains(secondTopic)) {
                        int indexFirst = topics.indexOf(topic);
                        int indexSecond = topics.indexOf(secondTopic);

                        topics.set(indexFirst, secondTopic);
                        topics.set(indexSecond, topic);

                        String firstExercise = topic + "-Exercise";
                        String secondExercise = secondTopic + "-Exercise";
                        if (topics.contains(firstExercise)) {
                            topics.remove(firstExercise);
                            topics.add(topics.indexOf(topic) + 1, firstExercise);
                        }
                        if (topics.contains(secondExercise)) {
                            topics.remove(secondExercise);
                            topics.add(topics.indexOf(secondTopic) + 1, secondExercise);
                        }
                    }
                    break;
                case "Exercise":
                    String exerciseName = topic + "-Exercise";
                    int indexTopic = topics.indexOf(topic);
                    if (topics.contains(topic)) {
                        if (indexTopic == topics.size() - 1) {
                            topics.add(indexTopic + 1, exerciseName);
                        } else if (topics.get(indexTopic + 1).equals(exerciseName)) {
                            topics.add(indexTopic + 1, exerciseName);
                        }
                    } else {
                        topics.add(topic);
                        topics.add(exerciseName);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        int count = 1;
        for (String topic : topics) {
            System.out.println(count + "." + topic);
            count++;
        }
    }
}