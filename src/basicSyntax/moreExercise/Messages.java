package basicSyntax.moreExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= count; i++) {

            String input = scanner.nextLine();
            int numLength = input.length();
            int number = Integer.parseInt(input);

            int mainDigit = number % 10;
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }

            int letterIndex = offset + numLength - 1;

            if (letterIndex == -6) {
                letterIndex -= 59;
            }

            char ch = (char) (letterIndex + 97);
            output.append(ch);
        }

        System.out.println(output);

    }
}

