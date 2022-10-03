package stringBuilder.exercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        double sum = 0;

        for (String input : data) {

            char firstLetter = input.charAt(0);
            char secondLetter = input.charAt(input.length() - 1);

            double number = Double.parseDouble(input.substring(1, input.length() - 1));

            if (Character.isLowerCase(firstLetter)) {
                sum += getPos(firstLetter) * number;

            } else {
                sum += number / getPos(firstLetter);
            }

            if (Character.isLowerCase(secondLetter)) {
                sum += getPos(secondLetter);

            } else {
                sum -= getPos(secondLetter);
            }

        }
        System.out.printf("%.2f", sum);

    }

    private static int getPos(char firstLetter) {
        return Character.toLowerCase(firstLetter) - 96;
    }


}
