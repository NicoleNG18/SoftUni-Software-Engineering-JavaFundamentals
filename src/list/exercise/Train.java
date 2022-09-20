package list.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maximumCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandArray = command.split("\\s+");

            if (commandArray[0].equals("Add")) {
                wagons.add(Integer.parseInt(commandArray[1]));

            } else {

                int numberOfPeople = Integer.parseInt(commandArray[0]);

                for (int i = 0; i < wagons.size(); i++) {

                    if (wagons.get(i) + numberOfPeople <= maximumCapacity) {
                        wagons.set(i, wagons.get(i) + numberOfPeople);
                        break;
                    }

                }
            }

            command = scanner.nextLine();
        }

        for (int num : wagons) {
            System.out.print(num + " ");
        }

    }
}

