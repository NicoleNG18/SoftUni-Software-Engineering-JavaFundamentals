package maps.exercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<Double>> things = new LinkedHashMap<>();

        while (!command.equals("buy")) {

            String[] commandArr = command.split("\\s+");

            if (things.containsKey(commandArr[0])) {
                things.get(commandArr[0]).set(0, Double.parseDouble(commandArr[1]));
                things.get(commandArr[0]).set(1, Double.parseDouble(commandArr[2]) + things.get(commandArr[0]).get(1));

            } else {
                things.put(commandArr[0], new ArrayList<>());
                things.get(commandArr[0]).add(Double.parseDouble(commandArr[1]));//price
                things.get(commandArr[0]).add(Double.parseDouble(commandArr[2]));//quantity
            }

            command = scanner.nextLine();
        }

        things.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v.get(0) * v.get(1)));

    }


}