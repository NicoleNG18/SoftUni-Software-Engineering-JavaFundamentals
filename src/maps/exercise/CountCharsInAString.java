package maps.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) != 32) {
                chars.putIfAbsent(input.charAt(i), 0);
                chars.put(input.charAt(i), chars.get(input.charAt(i)) + 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }


}

