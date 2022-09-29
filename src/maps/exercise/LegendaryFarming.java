package maps.exercise;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> others = new LinkedHashMap<>();
        boolean hasWinner = false;
        String winnerName = "";

        while (!hasWinner) {

            String[] arr = scanner.nextLine().split("\\s+");

            for (int i = 0; i < arr.length; i += 2) {

                int quantity = Integer.parseInt(arr[i]);
                String typeOfMaterial = arr[i + 1].toLowerCase(Locale.ROOT);

                if (typeOfMaterial.equals("shards") || typeOfMaterial.equals("fragments") || typeOfMaterial.equals("motes")) {
                    materials.put(typeOfMaterial, materials.get(typeOfMaterial) + quantity);

                } else {
                    others.putIfAbsent(typeOfMaterial, 0);
                    others.put(typeOfMaterial, others.get(typeOfMaterial) + quantity);
                }

                if (materials.get("shards") >= 250) {

                    hasWinner = true;
                    materials.put("shards", materials.get("shards") - 250);
                    winnerName = "Shadowmourne";
                    break;

                } else if (materials.get("motes") >= 250) {
                    hasWinner = true;
                    materials.put("motes", materials.get("motes") - 250);
                    winnerName = "Dragonwrath";
                    break;

                } else if (materials.get("fragments") >= 250) {
                    hasWinner = true;
                    materials.put("fragments", materials.get("fragments") - 250);
                    winnerName = "Valanyr";
                    break;
                }

            }

        }

        System.out.printf("%s obtained!%n", winnerName);

        for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : others.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }


}
