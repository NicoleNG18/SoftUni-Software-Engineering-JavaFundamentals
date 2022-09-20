package list.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            printResult(numbers, command);
            command = scanner.nextLine();
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }

    private static void printResult(List<Integer> numbers, String command) {
        String[] commandArray = command.split("\\s+");

        switch (commandArray[0]) {
            case "Add":
                numbers.add(Integer.parseInt(commandArray[1]));
                break;

            case "Insert":
                if (Integer.parseInt(commandArray[2]) >= 0 && Integer.parseInt(commandArray[2]) < numbers.size()) {
                    numbers.add(Integer.parseInt(commandArray[2]), Integer.parseInt(commandArray[1]));

                } else {
                    System.out.println("Invalid index");
                }
                break;

            case "Remove":
                if (Integer.parseInt(commandArray[1]) >= 0 && Integer.parseInt(commandArray[1]) < numbers.size()) {
                    numbers.remove(Integer.parseInt(commandArray[1]));

                } else {
                    System.out.println("Invalid index");
                }
                break;

            case "Shift":
                if (commandArray[1].equals("right")) {
                    right(numbers, commandArray);

                } else if (commandArray[1].equals("left")) {
                    left(numbers, commandArray);
                }
                break;
        }
    }

    private static void right(List<Integer> numbers, String[] array) {
        int count = Integer.parseInt(array[2]);

        for (int i = 1; i <= count; i++) {

            int help = numbers.get(numbers.size() - 1);

            for (int j = numbers.size() - 1; j >= 0; j--) {

                if (j != 0) {
                    numbers.set(j, numbers.get(j - 1));

                } else {
                    numbers.set(0, help);
                }
            }
        }
    }

    private static void left(List<Integer> numbers, String[] array) {
        int count = Integer.parseInt(array[2]);

        for (int i = 1; i <= count; i++) {
            int help = numbers.get(0);

            for (int j = 0; j < numbers.size(); j++) {

                if (j != numbers.size() - 1) {
                    numbers.set(j, numbers.get(j + 1));

                } else {
                    numbers.set(numbers.size() - 1, help);
                }
            }
        }
    }

}
