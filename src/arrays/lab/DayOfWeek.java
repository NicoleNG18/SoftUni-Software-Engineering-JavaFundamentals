package arrays.lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wantedDayNumber = Integer.parseInt(scanner.nextLine());

        String[] daysOfTheWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (wantedDayNumber >= 1 && wantedDayNumber <= 7) {
            System.out.println(daysOfTheWeek[wantedDayNumber - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}