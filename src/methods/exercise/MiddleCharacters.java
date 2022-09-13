package methods.exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String input) {

        if (input.length() % 2 == 0) {
            int index = (input.length() / 2) + 1;
            String result = String.valueOf(input.charAt(index - 2)) + String.valueOf(input.charAt(index - 1));
            System.out.println(result);

        } else {
            int index = (input.length() / 2);
            String result = String.valueOf(input.charAt(index));
            System.out.println(result);

        }
    }


}

