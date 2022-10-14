package finalExamPreparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder decrypted = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {

            String[] commandArr = command.split("\\|");

            if (commandArr[0].equals("Move")) {

                int help = Integer.parseInt(commandArr[1]);
                String substring = decrypted.substring(0, help);

                decrypted.delete(0, help);
                decrypted.append(substring);

            } else if (commandArr[0].equals("Insert")) {

                int index = Integer.parseInt(commandArr[1]);
                String value = commandArr[2];

                decrypted.insert(index, value);

            } else if (commandArr[0].equals("ChangeAll")) {

                String substring = commandArr[1];
                String replacement = commandArr[2];

                for (int i = 0; i < decrypted.length(); i++) {

                    if (String.valueOf(decrypted.charAt(i)).equals(substring)) {
                        decrypted.deleteCharAt(i);
                        decrypted.insert(i, replacement);
                    }

                }

            }

            command = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", decrypted);
    }


}
