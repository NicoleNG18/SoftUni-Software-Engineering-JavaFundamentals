package methods.lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String typeOfVariable = SCANNER.nextLine();

        printGreater(typeOfVariable);
    }

    private static void printGreater(String typeOfVariable) {
        switch (typeOfVariable) {

            case "int":
                getMaxInt();
                break;

            case "char":
                getMaxChar();
                break;

            case "string":
                getMaxString();
                break;
        }

    }

    private static void getMaxString() {

        String first = SCANNER.nextLine();
        String second = SCANNER.nextLine();

        if (first.length() > second.length()) {
            System.out.println(first);

        } else {
            System.out.println(second);
        }

    }

    private static void getMaxChar() {

        char first = SCANNER.nextLine().charAt(0);
        char second =SCANNER.nextLine().charAt(0);

        if (first > second) {
            System.out.println(first);

        } else {
            System.out.println(second);
        }

    }

    private static void getMaxInt() {

        int firstNum = Integer.parseInt(SCANNER.nextLine());
        int secondNum = Integer.parseInt(SCANNER.nextLine());

        if (firstNum > secondNum) {
            System.out.println(firstNum);

        } else {
            System.out.println(secondNum);
        }

    }

}

