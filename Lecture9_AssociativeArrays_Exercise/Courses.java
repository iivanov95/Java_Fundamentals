package Lecture9_AssociativeArrays_Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> coursesMap = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!coursesMap.containsKey(courseName)) {
                coursesMap.put(courseName, new ArrayList<>());
            }
            coursesMap.get(courseName).add(studentName);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> course : coursesMap.entrySet()) {
            System.out.println(course.getKey() + ": " + course.getValue().size());
            for (String student : course.getValue()) {
                System.out.println("-- " + student);
            }
        }
    }
}