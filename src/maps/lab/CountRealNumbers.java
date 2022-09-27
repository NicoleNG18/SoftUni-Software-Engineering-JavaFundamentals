package maps.lab;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Integer, Integer> numbers = new TreeMap<>();
        String[] array = scanner.nextLine().split("\\s+");

        for (String s : array) {

            if (!numbers.containsKey(Integer.parseInt(s))) {
                numbers.put(Integer.parseInt(s), 1);

            } else {
                numbers.put(Integer.parseInt(s), numbers.get(Integer.parseInt(s)) + 1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());
        }

    }

}
