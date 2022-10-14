package finalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("([#|])(?<item>[A-Za-z ]+)\\1" +
                "(?<date>[0-9]{2}/[0-9]{2}?/[0-9]{2})\\1" +
                "(?<calories>[0]|[0-9]{1,5})\\1");
        Matcher matcher = pattern.matcher(text);

        double totalKcal = 0;

        while (matcher.find()) {
            totalKcal += Integer.parseInt(matcher.group("calories"));
        }

        Matcher second = pattern.matcher(text);

        System.out.printf("You have food to last you for: %.0f days!%n", Math.floor(totalKcal / 2000));

        if (totalKcal > 2000) {

            while (second.find()) {

                String item = second.group("item");
                String date = second.group("date");

                int calories = Integer.parseInt(second.group("calories"));
                System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", item, date, calories);
            }

        }

    }


}

