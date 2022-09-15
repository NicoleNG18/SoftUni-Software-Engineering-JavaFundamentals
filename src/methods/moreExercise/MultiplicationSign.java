package methods.moreExercise;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        double third = Double.parseDouble(scanner.nextLine());

        printResult(first, second, third);
    }

    private static void printResult(double first, double second, double third) {
        if (isEqualToZero(first, second, third)) {
            System.out.println("zero");

        } else if (check(first, second, third)) {
            System.out.println("positive");

        } else {
            System.out.println("negative");
        }

    }

    private static boolean check(double first, double second, double third) {
        return (first > 0 && second > 0 && third > 0)
                || (first < 0 && second > 0 && third < 0)
                || (first < 0 && second < 0 && third > 0)
                || (first > 0 && second < 0 && third < 0);
    }

    private static boolean isEqualToZero(double first, double second, double third) {
        return first == 0 || second == 0 || third == 0;
    }


}

