package list.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            getOutput(command, elements);
            command = scanner.nextLine();
        }

    }

    private static void getOutput(String command, List<Integer> elements) {

        String[] commandArray = command.split("\\s+");

        switch (commandArray[0]) {

            case "Contains":
                contains(commandArray, elements);
                break;

            case "Print":
                if (commandArray[1].equals("even")) {
                    printEven(elements);
                } else {
                    printOdd(elements);
                }
                break;

            case "Get":
                getSum(elements);
                break;

            case "Filter":
                filtered(elements, commandArray);
                break;

        }

    }

    private static void filtered(List<Integer> elements, String[] commandArray) {
        int number = Integer.parseInt(commandArray[2]);

        switch (commandArray[1]) {

            case ">=":
                for (int num : elements) {
                    if (num >= number) {
                        System.out.print(num + " ");
                    }
                }
                break;

            case ">":
                for (int num : elements) {
                    if (num > number) {
                        System.out.print(num + " ");
                    }
                }
                break;

            case "<=":
                for (int num : elements) {
                    if (num <= number) {
                        System.out.print(num + " ");
                    }
                }
                break;

            case "<":
                for (int num : elements) {
                    if (num < number) {
                        System.out.print(num + " ");
                    }
                }
                break;
        }

        System.out.println();

    }


    private static void getSum(List<Integer> elements) {
        int sum = 0;

        for (int num : elements) {
            sum += num;
        }

        System.out.println(sum);
    }

    private static void printOdd(List<Integer> elements) {
        for (int number : elements) {

            if (number % 2 != 0) {
                System.out.print(number + " ");
            }

        }
        System.out.println();
    }

    private static void printEven(List<Integer> elements) {
        for (int number : elements) {

            if (number % 2 == 0) {
                System.out.print(number + " ");
            }

        }
        System.out.println();
    }

    private static void contains(String[] commandArray, List<Integer> elements) {
        if (elements.contains(Integer.parseInt(commandArray[1]))) {
            System.out.println("Yes");

        } else {
            System.out.println("No such number");
        }

    }


}

