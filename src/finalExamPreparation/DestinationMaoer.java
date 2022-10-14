package finalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMaoer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> destinations = new ArrayList<>();

        int sum = 0;
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([=/])(?<name>[A-Z][A-Za-z]{2,})(\\1)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            destinations.add(matcher.group("name"));
            sum += matcher.group("name").length();
        }

        System.out.printf("Destinations: %s%n", String.join(", ", destinations));
        System.out.printf("Travel Points: %d%n", sum);
    }


}

