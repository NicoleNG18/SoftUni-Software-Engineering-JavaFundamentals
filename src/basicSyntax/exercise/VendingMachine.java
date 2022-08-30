package basicSyntax.exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0;
        String command = scanner.nextLine();

        while (!(command.equals("Start"))) {

            double money = Double.parseDouble(command);

            if (money == 1.0 || money == 2.0 || money == 0.5 || money == 0.2 || money == 0.1) {

                totalMoney += money;

            } else {

                System.out.printf("Cannot accept %.2f%n", money);

            }

            command = scanner.nextLine();
        }

        String products = scanner.nextLine();

        while (!(products.equals("End"))) {

            switch (products) {

                case "Nuts": {
                    totalMoney = getTotalMoney(totalMoney, 2.0, "Purchased Nuts");
                    break;
                }

                case "Water": {
                    totalMoney = getTotalMoney(totalMoney, 0.7, "Purchased Water");
                    break;
                }

                case "Crisps": {
                    totalMoney = getTotalMoney(totalMoney, 1.5, "Purchased Crisps");
                    break;
                }

                case "Soda": {
                    totalMoney = getTotalMoney(totalMoney, 0.8, "Purchased Soda");
                    break;
                }

                case "Coke": {
                    totalMoney = getTotalMoney(totalMoney, 1.0, "Purchased Coke");
                    break;
                }

                default:
                    System.out.println("Invalid product");
                    break;
            }

            products = scanner.nextLine();

        }

        System.out.printf("Change: %.2f", totalMoney);

    }

    private static double getTotalMoney(double totalMoney, double x, String Purchased_Nuts) {
        if (totalMoney < x) {
            System.out.println("Sorry, not enough money");
        } else {
            totalMoney -= x;
            System.out.println(Purchased_Nuts);
        }
        return totalMoney;
    }
}


