package list.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandArray = command.split("\\s+");

            if (commandArray[0].equals("Delete")) {
                int element = Integer.parseInt(commandArray[1]);

                for (int i = 0; i < numbers.size(); i++) {

                    if (numbers.get(i) == element) {
                        numbers.remove(i);
                        i++;
                    }

                }

            } else if (commandArray[0].equals("Insert")) {

                int element = Integer.parseInt(commandArray[1]);
                int index = Integer.parseInt(commandArray[2]);

                numbers.add(index, element);
            }

            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}

