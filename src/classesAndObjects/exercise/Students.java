package classesAndObjects.exercise;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            String[] command = scanner.nextLine().split("\\s+");
            people.add(new Student(command[0], command[1], Double.parseDouble(command[2])));
        }

        people.stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade())).forEach(System.out::println);

    }


    static class Student {
        private String firstName;
        private String lastName;
        private double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getGrade() {
            return this.grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.getFirstName(), this.getLastName(), this.getGrade());
        }

    }


}

