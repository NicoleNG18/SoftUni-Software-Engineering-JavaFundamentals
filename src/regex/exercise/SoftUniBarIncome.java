package regex.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("end of shift")) {

            Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%.*<(?<product>\\w+)>.*\\|" +
                    "(?<count>\\d+)\\|.*?(?<price>[+-]?[0-9]+\\.?[0-9]+)\\$");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                System.out.printf("%s: %s - %.2f%n", matcher.group("name"), matcher.group("product"),
                        Double.parseDouble(String.valueOf(matcher.group("count"))) *
                                Double.parseDouble(String.valueOf(matcher.group("price"))));
                sum += Double.parseDouble(String.valueOf(matcher.group("count"))) *
                        Double.parseDouble(String.valueOf(matcher.group("price")));
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", sum);
    }


}

