package finalExamPreparation;


import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder rawKey = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Generate")) {

            String[] inputArr = input.split(">>>");

            if (inputArr[0].equals("Contains")) {

                String substring = inputArr[1];

                if (rawKey.toString().contains(substring)) {
                    System.out.printf("%s contains %s%n", rawKey, substring);

                } else {
                    System.out.println("Substring not found!");
                }

            } else if (inputArr[0].equals("Flip")) {

                int startIndex = Integer.parseInt(inputArr[2]);
                int endIndex = Integer.parseInt(inputArr[3]);

                String substring = rawKey.substring(startIndex, endIndex);

                if (inputArr[1].equals("Upper")) {

                    substring = substring.toUpperCase();
                    rawKey.replace(startIndex, endIndex, substring);

                } else if (inputArr[1].equals("Lower")) {

                    substring = substring.toLowerCase();
                    rawKey.replace(startIndex, endIndex, substring);

                }

                System.out.println(rawKey);

            } else if (inputArr[0].equals("Slice")) {

                int start = Integer.parseInt(inputArr[1]);
                int end = Integer.parseInt(inputArr[2]);

                rawKey.delete(start, end);
                System.out.println(rawKey);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", rawKey);
    }


}

