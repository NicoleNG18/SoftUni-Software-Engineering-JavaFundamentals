package maps.exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (students.containsKey(name)) {
                students.get(name).add(grade);

            } else {
                students.put(name, new ArrayList<>());
                students.get(name).add(grade);
            }

        }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {

            double mapSum = entry.getValue().stream().mapToDouble(e -> e).sum();
            double average = mapSum / entry.getValue().size();

            if (average >= 4.5) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), average);
            }

        }

    }


}
