package dataTypes.moreExercise;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        if (Math.abs(firstNumber - secondNumber) >= 0.000001) {

            System.out.println("False");

        } else {
            System.out.println("True");
        }

    }
}

