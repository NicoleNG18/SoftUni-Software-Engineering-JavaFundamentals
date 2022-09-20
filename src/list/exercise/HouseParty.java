package list.exercise;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class HouseParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfGuests = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 1; i <= numOfGuests; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            if (input[2].equals("going!")) {

                if ((!guests.contains(input[0]))) {
                    guests.add(input[0]);

                } else {
                    System.out.printf("%s is already in the list!%n", input[0]);
                }

            } else if (input[2].equals("not")) {

                if ((guests.contains(input[0]))) {
                    guests.remove(input[0]);

                } else {
                    System.out.printf("%s is not in the list!%n", input[0]);
                }

            }

        }

        for (String s : guests) {
            System.out.println(s);
        }

    }
}
