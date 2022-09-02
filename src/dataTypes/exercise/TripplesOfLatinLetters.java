package dataTypes.exercise;

import java.util.Scanner;

public class TripplesOfLatinLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {

            for (int j = 0; j < input; j++) {

                for (int k = 0; k < input; k++) {

                    System.out.printf("%c%c%c%n", (char) i + 97, (char) j + 97, (char) k + 97);

                }

            }

        }

    }
}

