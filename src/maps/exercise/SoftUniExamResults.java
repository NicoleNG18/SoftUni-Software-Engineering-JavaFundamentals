package maps.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        Map<String, Integer> languageCount = new LinkedHashMap<>();
        Map<String, Integer> studentScore = new LinkedHashMap<>();

        while (!lineInput.equals("exam finished")) {

            String[] data = lineInput.split("-");
            String username = data[0];

            if (data[1].equals("banned")) {
                studentScore.remove(username);

            } else {

                String language = data[1];
                int points = Integer.parseInt(data[2]);

                languageCount.putIfAbsent(language, 0);
                languageCount.put(language, languageCount.get(language) + 1);
                studentScore.putIfAbsent(username, 0);

                if (studentScore.get(username) > points) {
                    studentScore.put(username, studentScore.get(username));

                } else {
                    studentScore.put(username, points);
                }
            }

            lineInput = scanner.nextLine();
        }

        System.out.println("Results:");
        studentScore.forEach((k, v) -> System.out.printf("%s | %d%n", k, v));

        System.out.println("Submissions:");
        languageCount.forEach((k, v) -> System.out.printf("%s - %d%n", k, v));
    }


}
