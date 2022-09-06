package arrays.exercise;

import java.util.Scanner;
import java.util.Arrays;

public class LadyBugs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());

        int[] field = new int[fieldSize];

        String[] initialBugs = Arrays.stream(scanner.nextLine().split("[\\s]"))
                .filter(e -> !e.equals(""))
                .map(String::toString)
                .toArray(String[]::new);

        for (String initialBug : initialBugs) {

            int index = Integer.parseInt(initialBug);

            if (index >= 0 && index < fieldSize) {
                field[index] = 1;
            }

        }

        String command = scanner.nextLine();

        while (!"end".equals(command)) {

            String[] actionCommand = command.split("[\\s]");

            int bugToMove = Integer.parseInt(actionCommand[0]);
            String direction = actionCommand[1];
            int flyLength = Integer.parseInt(actionCommand[2]);

            if (bugToMove < 0 || bugToMove > fieldSize - 1 || field[bugToMove] == 0) {

                command = scanner.nextLine();
                continue;

            } else {
                field[bugToMove] = 0;

                if ("right".equals(direction)) {
                    bugToMove += flyLength;

                    while (bugToMove < fieldSize && field[bugToMove] == 1) {
                        bugToMove += flyLength;
                    }

                    if (bugToMove < fieldSize) {

                        field[bugToMove] = 1;

                    }
                } else {
                    bugToMove -= flyLength;

                    while (bugToMove >= 0 && field[bugToMove] == 1) {
                        bugToMove -= flyLength;
                    }

                    if (bugToMove >= 0) {

                        if (bugToMove < fieldSize) {
                            field[bugToMove] = 1;
                        }

                    }
                }
            }

            command = scanner.nextLine();

        }

        for (int i1 : field) {
            System.out.print(i1 + " ");
        }

    }
}

