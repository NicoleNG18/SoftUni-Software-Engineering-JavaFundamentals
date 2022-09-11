package methods.lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        printBill(product, quantity);
    }

    private static void printBill(String product, int quantity) {
        switch (product) {

            case "water":
                System.out.printf("%.02f", quantity * 1.0);
                break;

            case "coffee":
                System.out.printf("%.02f", quantity * 1.5);
                break;

            case "coke":
                System.out.printf("%.02f", quantity * 1.4);
                break;

            case "snacks":
                System.out.printf("%.02f", quantity * 2.0);
                break;
        }
    }

}

