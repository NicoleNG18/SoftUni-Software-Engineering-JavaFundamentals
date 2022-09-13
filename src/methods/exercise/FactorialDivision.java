package methods.exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", factorial(firstNum) / factorial(secondNum));
    }

    private static double factorial(int number) {
        double factorial = 1;

        for (int i = number; i > 1; i--) {
            factorial *= i;
        }

        return factorial;
    }
}

