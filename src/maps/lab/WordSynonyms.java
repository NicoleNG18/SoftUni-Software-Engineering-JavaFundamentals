package maps.lab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {

            String inputWord = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(inputWord, new ArrayList<>());
            words.get(inputWord).add(synonym);
        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().toString().replace("[", "").replace("]", ""));
        }

    }


}

