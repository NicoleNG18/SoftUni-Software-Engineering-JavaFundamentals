package finalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("([@#])([A-za-z]{3,})\\1{2}([A-za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(text);

        Map<String, String> words = new LinkedHashMap<>();
        int count = 0;

        while (matcher.find()) {

            count++;

            StringBuilder first = new StringBuilder(matcher.group(2));
            StringBuilder reversed = new StringBuilder(matcher.group(3));

            reversed.reverse();

            if (first.toString().equals(reversed.toString())) {
                words.put(matcher.group(2), matcher.group(3));
            }

        }

        if (count != 0) {
            System.out.printf("%d word pairs found!%n", count);

        } else {
            System.out.println("No word pairs found!");
        }

        if (words.isEmpty()) {
            System.out.println("No mirror words!");

        } else {
            System.out.println("The mirror words are: ");

            StringBuilder finalWord = new StringBuilder();

            for (Map.Entry<String, String> entry : words.entrySet()) {
                finalWord.append(entry.getKey() + " <=> " + entry.getValue() + ", ");
            }

            finalWord.delete(finalWord.length() - 2, finalWord.length());

            System.out.println(finalWord);
        }

    }


}

