package regex.lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(\\d{2})([ .\\\\/-])([A-Z][a-z]{2})\\2(\\d{4})");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.printf("Day: %s, ", matcher.group(1));
            System.out.printf("Month: %s, ", matcher.group(3));
            System.out.printf("Year: %s%n", matcher.group(4));
        }

    }


}

