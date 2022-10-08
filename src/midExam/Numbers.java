package midExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).toList();

        String command = scanner.nextLine();

        while (!command.equals("Finish")) {

            String[] commandArr = command.split("\\s+");
            int value = Integer.parseInt(commandArr[1]);

            switch (commandArr[0]) {

                case "Add":
                    numbers.add(value);
                    break;

                case "Remove":
                    if (numbers.contains(value)) {

                        for (int index = 0; index < numbers.size(); index++) {

                            if (numbers.get(index) == value) {
                                numbers.remove(index);
                                break;
                            }

                        }

                    }
                    break;

                case "Replace":

                    int secondValue = Integer.parseInt(commandArr[2]);
                    int index = numbers.indexOf(value);

                    numbers.set(index, secondValue);
                    break;

                case "Collapse":
                    int i = 0;

                    while (i < numbers.size()) {

                        if (numbers.get(i) < value) {
                            numbers.remove(i);

                        } else {
                            i++;
                        }

                    }
                    break;

            }

            command = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }


}

