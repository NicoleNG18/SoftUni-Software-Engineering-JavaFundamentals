package dataTypes.moreExercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int countOpening = 0;
        int countClosing = 0;
        boolean check = false;

        for (int i = 0; i < numberOfLines; i++) {

            String input = scanner.nextLine();

            if (input.equals("(")) {
                countOpening++;

                if (countOpening - countClosing != 1) {

                    check = true;

                }
            } else if (input.equals(")")) {
                countClosing++;

                if (countOpening - countClosing != 0) {

                    check = true;

                }
            }
        }


        if (!(check) && countClosing == countOpening) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}
