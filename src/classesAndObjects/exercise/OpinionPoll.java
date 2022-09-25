package classesAndObjects.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            String[] command = scanner.nextLine().split("\\s+");
            Person current = new Person(command[0], Integer.parseInt(command[1]));

            if (current.getAge() > 30) {
                people.add(current);
            }

        }

        for (Person person : people) {
            System.out.println(person.toString());
        }

    }

    static class Person {
        private String name;
        private int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s - %s", this.name, this.age);
        }
    }

}

