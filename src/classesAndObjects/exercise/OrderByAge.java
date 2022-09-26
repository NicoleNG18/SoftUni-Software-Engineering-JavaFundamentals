package classesAndObjects.exercise;

import java.util.*;

public class OrderByAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<People> info = new ArrayList<>();

        while (!input.equals("End")) {

            String[] data = input.split("\\s+");

            People current = new People(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));

            info.add(current);
            input = scanner.nextLine();
        }

        info.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(person -> System.out.println(person.toString()));

    }

    static class People {
        private String name;
        private int id;
        private int age;

        public People(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getId() {
            return this.id;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %d is %d years old.", this.getName(), this.getId(), this.getAge());
        }

    }


}
