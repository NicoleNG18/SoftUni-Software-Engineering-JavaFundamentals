package basicSyntax.exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double neededMoney = 0;

        neededMoney += robePrice * countOfStudents;
        neededMoney += (lightSaberPrice * (countOfStudents + (Math.ceil(0.1 * countOfStudents))));

        int freeBelts = countOfStudents / 6;

        neededMoney += (beltPrice * (countOfStudents - freeBelts));

        if (neededMoney <= amountOfMoney) {

            System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);

        } else {

            System.out.printf("George Lucas will need %.2flv more.", neededMoney - amountOfMoney);

        }

    }
}
