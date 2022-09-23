package classesAndObjects.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {

        String firstName;
        String lastName;
        int age;
        String hometown;

        Student(String[] current) {
            this.firstName = current[0];
            this.lastName = current[1];
            this.age = Integer.parseInt(current[2]);
            this.hometown = current[3];
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {

            String[] data = input.split("\\s+");
            int index = IndexOf(students, new Student(data).firstName, new Student(data).lastName);

            if (index == -1) {
                students.add(new Student(data));

            } else {
                students.set(index, new Student(data));
            }

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student s : students) {

            if (s.hometown.equals(city)) {
                System.out.println(s.firstName + " " + s.lastName + " is " + s.age + " years old");
            }

        }
    }

    private static int IndexOf(List<Student> students, String firstName, String lastName) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).firstName.equals(firstName) && students.get(i).lastName.equals(lastName)) {
                return i;
            }

        }
        return -1;
    }
}

