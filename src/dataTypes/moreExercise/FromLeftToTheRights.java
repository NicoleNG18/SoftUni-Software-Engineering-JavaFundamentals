package dataTypes.moreExercise;

import java.util.Scanner;

public class FromLeftToTheRights {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int sumDigits = 0;

        for (int i = 0; i < input; i++) {

            long firstNumber = scanner.nextLong();
            long secondNumber = scanner.nextLong();

            if (firstNumber > secondNumber) {

                long newNumber = Math.abs(firstNumber);

                while (newNumber != 0) {

                    sumDigits += newNumber % 10;
                    newNumber /= 10;

                }

            } else {

                long newNum = Math.abs(secondNumber);

                while (newNum != 0) {

                    sumDigits += newNum % 10;
                    newNum /= 10;

                }
            }

            System.out.println(sumDigits);
            sumDigits = 0;

        }

    }
}


