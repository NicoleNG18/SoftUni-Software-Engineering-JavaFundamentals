package arrays.exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstArrAsStrings = scanner.nextLine().split("\\s+");
        String[] secondArrAsStrings = scanner.nextLine().split("\\s+");

        for (String secondArrAsString : secondArrAsStrings) {

            for (String firstArrAsString : firstArrAsStrings) {

                if (secondArrAsString.equals(firstArrAsString)) {
                    System.out.print(secondArrAsString + " ");
                }

            }

        }

    }
}

