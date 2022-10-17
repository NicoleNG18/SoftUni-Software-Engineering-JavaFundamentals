package finalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<String, Integer> emoji = new LinkedHashMap<>();

        Pattern numbers = Pattern.compile("[0-9]");
        Pattern emojis = Pattern.compile("(\\*\\*|::)([A-Z][a-z]{2,})\\1");

        Matcher numbersMatcher = numbers.matcher(text);
        Matcher emojiMatcher = emojis.matcher(text);

        int coolness = 1;

        while (numbersMatcher.find()) {
            coolness *= Integer.parseInt(numbersMatcher.group());
        }

        int count = 0;

        while (emojiMatcher.find()) {

            count++;
            int sum = 0;

            for (int i = 0; i < emojiMatcher.group(2).length(); i++) {
                sum += emojiMatcher.group(2).charAt(i);
            }

            if (sum >= coolness) {
                emoji.put(emojiMatcher.group(0), sum);
            }

        }

        System.out.printf("Cool threshold: %d%n", coolness);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", count);

        for (Map.Entry<String, Integer> entry : emoji.entrySet()) {
            System.out.println(entry.getKey());
        }

    }


}
