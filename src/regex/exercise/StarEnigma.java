package regex.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int decriptionKey = 0;
            String input = scanner.nextLine();

            for (int j = 0; j < input.length(); j++) {

                if (isDeterminedChar(input, j)) {
                    decriptionKey++;
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int count = 0; count < input.length(); count++) {
                sb.append((char) (input.charAt(count) - decriptionKey));
            }

            Pattern pattern = Pattern.compile("^[^@\\-!:>]*@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:" +
                    "(?<population>[\\d]+)[^@\\-!:>]*!(?<aord>[AD])![^@\\-!:>]*->" +
                    "(?<soldierCount>\\d+)[^@\\-!:>]*$");
            Matcher matcher = pattern.matcher(sb);

            if (matcher.find()) {

                if (matcher.group("aord").equals("A")) {
                    attacked.add(String.valueOf(matcher.group("planetName")));

                } else {
                    destroyed.add(String.valueOf(matcher.group("planetName")));
                }
            }

        }

        System.out.printf("Attacked planets: %d%n", attacked.size());
        attacked.stream().sorted(String::compareTo).forEach(s -> System.out.printf("-> %s%n", s));

        System.out.printf("Destroyed planets: %d%n", destroyed.size());
        destroyed.stream().sorted(String::compareTo).forEach(s -> System.out.printf("-> %s%n", s));

    }

    private static boolean isDeterminedChar(String input, int j) {
        return input.charAt(j) == 83 || input.charAt(j) == 115 ||
                input.charAt(j) == 84 || input.charAt(j) == 116 ||
                input.charAt(j) == 65 || input.charAt(j) == 97 ||
                input.charAt(j) == 82 || input.charAt(j) == 114;
    }


}

