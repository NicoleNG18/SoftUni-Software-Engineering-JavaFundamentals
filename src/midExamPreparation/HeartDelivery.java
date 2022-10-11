package midExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] arrayLine = scanner.nextLine().split("@");
        List<Integer> houses = new ArrayList<>();

        for (String s : arrayLine) {
            houses.add(Integer.parseInt(s));
        }

        String command = scanner.nextLine();
        int placeOfCupid = 0;

        while (!command.equals("Love!")) {

            String[] commandArr = command.split("\\s+");
            int length = Integer.parseInt(commandArr[1]);

            if (placeOfCupid + length > houses.size() - 1) {
                placeOfCupid = 0;

            } else {
                placeOfCupid += length;
            }

            if (houses.get(placeOfCupid) == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", placeOfCupid);

            } else {
                houses.set(placeOfCupid, houses.get(placeOfCupid) - 2);

                if (houses.get(placeOfCupid) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", placeOfCupid);
                }
            }

            command = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", placeOfCupid);
        int count = 0;

        for (Integer house : houses) {
            if (house != 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Mission was successful.");

        } else {
            System.out.printf("Cupid has failed %d places.%n", count);
        }

    }


}

