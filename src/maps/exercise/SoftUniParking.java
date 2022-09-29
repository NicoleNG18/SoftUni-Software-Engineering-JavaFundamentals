package maps.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] command = scanner.nextLine().split("\\s+");

            if (command[0].equals("register")) {

                if (people.containsKey(command[1])) {
                    System.out.printf("ERROR: already registered with plate number %s%n", command[2]);

                } else {
                    people.put(command[1], command[2]);
                    System.out.printf("%s registered %s successfully%n", command[1], command[2]);
                }

            } else if (command[0].equals("unregister")) {

                if (people.containsKey(command[1])) {
                    people.remove(command[1]);
                    System.out.printf("%s unregistered successfully%n", command[1]);

                } else {
                    System.out.printf("ERROR: user %s not found%n", command[1]);
                }
            }

        }

        for (Map.Entry<String, String> entry : people.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }


}

