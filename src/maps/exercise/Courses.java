package maps.exercise;


import java.util.*;

public class Courses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> courseStudents = new LinkedHashMap<>();

        while (!input.equals("end")) {

            String[] commandArr = input.split(" : ");
            String course = commandArr[0];
            String student = commandArr[1];

            if (courseStudents.containsKey(course)) {
                courseStudents.get(course).add(student);

            } else {
                courseStudents.put(course, new ArrayList<>());
                courseStudents.get(course).add(student);
            }

            input = scanner.nextLine();

        }

        for (Map.Entry<String, List<String>> entry : courseStudents.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue().size());

            for (String s : entry.getValue()) {
                System.out.println("-- " + s);
            }

        }

    }


}

