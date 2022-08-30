package basicSyntax.exercise;


import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeopleInTheGroup = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();

        double totalPrice = 0;

        switch (typeGroup) {

            case "Students": {
                totalPrice = getTotalPrice(dayOfTheWeek,
                        totalPrice, numPeopleInTheGroup, 8.45,
                        numPeopleInTheGroup >= 30,
                        0.85, 9.80, 10.46);
                break;
            }

            case "Business": {
                totalPrice = getTotalPrice(numPeopleInTheGroup,
                        dayOfTheWeek, totalPrice);
                break;
            }

            case "Regular": {
                totalPrice = getTotalPrice(dayOfTheWeek, totalPrice, numPeopleInTheGroup, 15,
                        numPeopleInTheGroup >= 10 && numPeopleInTheGroup <= 20,
                        0.95, 20, 22.50);
                break;
            }

            default:
                break;
        }

        System.out.printf("Total price: %.2f", totalPrice);

    }

    private static double getTotalPrice(int numPeopleInTheGroup, String dayOfTheWeek, double totalPrice) {
        if (dayOfTheWeek.equals("Friday")) {
            totalPrice = numPeopleInTheGroup * 10.90;
            if (numPeopleInTheGroup >= 100) {
                totalPrice -= 109;
            }
        } else if (dayOfTheWeek.equals("Saturday")) {
            totalPrice = numPeopleInTheGroup * 15.60;
            if (numPeopleInTheGroup >= 100) {
                totalPrice -= 156;
            }
        } else if (dayOfTheWeek.equals("Sunday")) {
            totalPrice = numPeopleInTheGroup * 16;
            if (numPeopleInTheGroup >= 100) {
                totalPrice -= 160;
            }
        }
        return totalPrice;
    }

    private static double getTotalPrice(String dayOfTheWeek, double totalPrice, int numPeopleInTheGroup, double x, boolean numPeopleInTheGroup1, double totalPrice1, double x1, double x2) {
        if (dayOfTheWeek.equals("Friday")) {
            totalPrice = numPeopleInTheGroup * x;
            if (numPeopleInTheGroup1) {
                totalPrice *= totalPrice1;
            }
        } else if (dayOfTheWeek.equals("Saturday")) {
            totalPrice = numPeopleInTheGroup * x1;
            if (numPeopleInTheGroup1) {
                totalPrice *= totalPrice1;
            }
        } else if (dayOfTheWeek.equals("Sunday")) {
            totalPrice = numPeopleInTheGroup * x2;
            if (numPeopleInTheGroup1) {
                totalPrice *= totalPrice1;
            }
        }
        return totalPrice;
    }
}

