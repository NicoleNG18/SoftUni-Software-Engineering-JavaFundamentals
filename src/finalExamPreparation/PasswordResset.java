package finalExamPreparation;

import java.util.Scanner;

public class PasswordResset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder concealedMessage = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {

            String[] commandArr = command.split(":\\|:");

            if (commandArr[0].equals("InsertSpace")) {

                int index = Integer.parseInt(commandArr[1]);

                concealedMessage.insert(index, ' ');
                System.out.println(concealedMessage);

            } else if (commandArr[0].equals("Reverse")) {

                StringBuilder substring = new StringBuilder(commandArr[1]);

                if (concealedMessage.toString().contains(substring)) {

                    int index1 = concealedMessage.indexOf(substring.toString());

                    concealedMessage.delete(index1, index1 + substring.length());

                    concealedMessage.append(substring.reverse());
                    System.out.println(concealedMessage);

                } else {
                    System.out.println("error");
                }

            } else if (commandArr[0].equals("ChangeAll")) {

                String subStr = commandArr[1];
                String replacement = commandArr[2];

                if (concealedMessage.toString().contains(subStr)) {

                    String replaced = concealedMessage.toString().replaceAll(subStr, replacement);

                    concealedMessage.setLength(0);
                    concealedMessage.append(replaced);

                    System.out.println(concealedMessage);
                }

            }

            command = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s", concealedMessage);
    }


}

