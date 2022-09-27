package maps.lab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> words = new LinkedHashMap<>();
        String[] array = scanner.nextLine().split("\\s+");

        for (String s : array) {
            String word = s.toLowerCase(Locale.ROOT);

            if (!words.containsKey(word)) {
                words.put(word, 1);
            } else {
                words.put(word, words.get(word) + 1);
            }

        }

        List<String> output = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : words.entrySet()) {

            if (entry.getValue() % 2 != 0) {
                output.add(String.valueOf(entry.getKey()));
            }

        }

        System.out.println(String.join(", ", output));

    }

}
