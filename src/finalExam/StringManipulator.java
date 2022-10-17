package finalExam;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] help = input.split("\\s+");

            switch (help[0]) {

                case "Translate" -> {
                    String ch = help[1];
                    String replacement = help[2];

                    String replaced = message.toString().replaceAll(ch, replacement);

                    message.setLength(0);
                    message.append(replaced);

                    System.out.println(message);
                }

                case "Includes" -> {

                    String substring = help[1];

                    if (message.toString().contains(substring)) {
                        System.out.println("True");

                    } else {
                        System.out.println("False");
                    }
                }

                case "Start" -> {

                    String substring = help[1];

                    if (message.indexOf(substring) == 0) {
                        System.out.println("True");

                    } else {
                        System.out.println("False");
                    }
                }

                case "Lowercase" -> {

                    String lower = message.toString().toLowerCase();

                    message.setLength(0);
                    message.append(lower);

                    System.out.println(message);
                }

                case "FindIndex" -> {

                    String character = help[1];
                    int lastIndex = message.lastIndexOf(character);

                    System.out.println(lastIndex);
                }

                case "Remove" -> {

                    int startIndex = Integer.parseInt(help[1]);
                    int count = Integer.parseInt(help[2]);

                    message.delete(startIndex, startIndex + count);
                    System.out.println(message);
                }
            }

            input = scanner.nextLine();
        }
    }

}


