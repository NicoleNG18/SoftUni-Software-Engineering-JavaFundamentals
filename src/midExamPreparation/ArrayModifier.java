package midExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandArray = command.split("\\s+");

            if (commandArray[0].equals("swap")) {

                int firstIndex = Integer.parseInt(commandArray[1]);
                int secondIndex = Integer.parseInt(commandArray[2]);

                int help = numbers[firstIndex];
                numbers[firstIndex] = numbers[secondIndex];
                numbers[secondIndex] = help;

            } else if (commandArray[0].equals("multiply")) {

                int firstIndex = Integer.parseInt(commandArray[1]);
                int secondIndex = Integer.parseInt(commandArray[2]);

                numbers[firstIndex] = numbers[firstIndex] * numbers[secondIndex];

            } else if (commandArray[0].equals("decrease")) {

                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] -= 1;
                }

            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {

            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);

            } else {
                System.out.print(numbers[i] + ", ");
            }

        }

    }


}

