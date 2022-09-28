package maps.exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> people = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {

                String[] data = input.split("\\s+\\|\\s+");
                String side = data[0];
                String user = data[1];

                people.putIfAbsent(side, new ArrayList<>());

                boolean noneMatch = people.entrySet()
                        .stream()
                        .noneMatch(entry -> entry.getValue().contains(user));

                if (noneMatch) {
                    people.get(side).add(user);
                }

            } else if (input.contains("->")) {

                String[] data = input.split("\\s+->\\s+");
                String side = data[1];
                String username = data[0];

                people.forEach((k, v) -> v.remove(username));
                people.putIfAbsent(side, new ArrayList<>());
                people.get(side).add(username);

                System.out.printf("%s joins the %s side!%n", username, side);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : people.entrySet()) {

            if (entry.getValue().size() != 0) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                entry.getValue().forEach(e -> System.out.printf("! %s%n", e));
            }

        }

    }


}

