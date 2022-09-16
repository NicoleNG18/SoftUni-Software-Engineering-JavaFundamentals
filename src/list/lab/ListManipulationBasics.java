package list.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class ListManipulationBasics {
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

        for (int num : elements) {
            System.out.print(num + " ");
        }

    }

    private static void getOutput(String command, List<Integer> elements) {

        String[] commandArray = command.split("\\s+");
        String action = commandArray[0];

        if (action.equals("Insert")) {

            int number = Integer.parseInt(commandArray[1]);
            int secondIndex = Integer.parseInt(commandArray[2]);

            elements.add(secondIndex, number);

        } else {
            int number = Integer.parseInt(commandArray[1]);

            switch (action) {
                case "Add":
                    elements.add(number);
                    break;

                case "Remove":
                    elements.remove(Integer.valueOf(number));
                    break;

                case "RemoveAt":
                    elements.remove(number);
                    break;
            }

        }
    }


}

