package midExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> journal = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {

            String[] commandArr = command.split(" - ");

            switch (commandArr[0]) {

                case "Collect":
                    if (!journal.contains(commandArr[1])) {
                        journal.add(commandArr[1]);
                    }
                    break;

                case "Drop":
                    journal.remove(commandArr[1]);
                    break;

                case "Combine Items":
                    String[] help = commandArr[1].split(":");

                    if (journal.contains(help[0])) {
                        journal.add(journal.indexOf(help[0]) + 1, help[1]);
                    }
                    break;

                case "Renew":
                    if (journal.contains(commandArr[1])) {
                        journal.remove(commandArr[1]);
                        journal.add(commandArr[1]);
                    }
                    break;

            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < journal.size(); i++) {

            if (i != journal.size() - 1) {
                System.out.print(journal.get(i) + ", ");

            } else {
                System.out.print(journal.get(i));
            }
        }

    }


}

