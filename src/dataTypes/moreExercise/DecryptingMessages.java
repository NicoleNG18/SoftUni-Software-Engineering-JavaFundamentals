package dataTypes.moreExercise;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLines; i++) {

            char symbol = scanner.nextLine().charAt(0);

            System.out.print((char) (symbol + key));

        }

    }
}
