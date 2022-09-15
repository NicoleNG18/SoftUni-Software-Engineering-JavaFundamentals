package methods.moreExercise;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        printResult(firstLine, secondLine);
    }

    private static void printResult(String firstLine, String secondLine) {

        switch (firstLine) {

            case "int":
                System.out.println(Integer.parseInt(secondLine) * 2);
                break;

            case "real":
                System.out.printf("%.2f", Double.parseDouble(secondLine) * 1.5);
                break;

            case "string":
                System.out.printf("$%s$", secondLine);
                break;

        }
    }


}

