package midExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {

            String[] commandArray = command.split("\\s+");

            if (commandArray[0].equals("Loot")) {

                for (int i = 1; i < commandArray.length; i++) {

                    if (!elements.contains(commandArray[i])) {
                        elements.add(0, commandArray[i]);
                    }

                }

            } else if (commandArray[0].equals("Drop")) {

                int index = Integer.parseInt(commandArray[1]);

                if (index >= 0 && index < elements.size()) {
                    elements.add(elements.get(index));
                    elements.remove(index);
                }

            } else if (commandArray[0].equals("Steal")) {

                int count = Integer.parseInt(commandArray[1]);

                if (count >= elements.size()) {

                    for (int i = 0; i < elements.size(); i++) {
                        if (i == elements.size() - 1) {
                            System.out.print(elements.get(i));

                        } else {
                            System.out.print(elements.get(i) + ", ");
                        }
                    }

                    elements.clear();
                    System.out.println();

                } else {

                    int size = elements.size();
                    int j = elements.size() - count;

                    for (int i = j; i < size; i++) {

                        if (i == size - 1) {
                            System.out.print(elements.get(j));
                            elements.remove(j);

                        } else {
                            System.out.print(elements.get(j) + ", ");
                            elements.remove(j);
                        }
                    }
                    System.out.println();
                }

            }

            command = scanner.nextLine();
        }

        if (elements.isEmpty()) {
            System.out.println("Failed treasure hunt.");

        } else {
            int sum = 0;

            for (String element : elements) {
                sum += element.length();
            }

            double outputAverage = sum * 1.0 / elements.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", outputAverage);
        }

    }


}
