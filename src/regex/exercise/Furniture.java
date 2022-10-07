package regex.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furniture = new ArrayList<>();
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(>>)([A-z]+)(<<)([+-]?[0-9]+\\.?[0-9]*)(!)(\\d+)");

        double totalSum = 0;

        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                furniture.add(matcher.group(2));
                totalSum += Double.parseDouble(matcher.group(4)) * Double.parseDouble(matcher.group(6));
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");

        for (String s : furniture) {
            System.out.println(s);
        }

        System.out.printf("Total money spend: %.2f", totalSum);
    }


}
