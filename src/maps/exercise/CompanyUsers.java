package maps.exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> workers = new LinkedHashMap<>();

        while (!command.equals("End")) {

            String[] arr = command.split(" -> ");
            String name = arr[0];
            String id = arr[1];

            if (workers.containsKey(name)) {

                boolean check = workers.get(name).contains(id);

                if (!check) {
                    workers.get(name).add(id);
                }

            } else {
                workers.put(name, new ArrayList<>());
                workers.get(name).add(id);
            }

            command = scanner.nextLine();

        }

        for (Map.Entry<String, List<String>> entry : workers.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(e -> System.out.println("-- " + e));
        }

    }


}

