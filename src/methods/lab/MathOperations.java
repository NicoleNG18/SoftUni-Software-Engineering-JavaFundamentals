package methods.lab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double secondNumber = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", getResult(firstNumber, operator, secondNumber));
    }

    private static double getResult(double firstNumber, char operator, double secondNumber) {
        double result = 0;

        switch (operator) {

            case '*': {
                result = firstNumber * secondNumber;
                break;
            }

            case '+': {
                result = firstNumber + secondNumber;
                break;
            }

            case '-': {
                result = firstNumber - secondNumber;
                break;
            }

            case '/': {
                result = firstNumber / secondNumber;
                break;
            }

        }

        return result;

    }

}

