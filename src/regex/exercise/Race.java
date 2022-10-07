package regex.exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> peoplePart = new ArrayList<>(List.of(scanner.nextLine().split(", ")));

        String input = scanner.nextLine();
        Map<String, Integer> participants = new LinkedHashMap<>();

        for (String s : peoplePart) {
            participants.putIfAbsent(s, 0);
        }

        Pattern first = Pattern.compile("[A-Za-z]+");
        Pattern second = Pattern.compile("[0-9]");

        while (!input.equals("end of race")) {

            Matcher match = first.matcher(input);
            String name = "";

            while (match.find()) {
                name = name.concat(match.group(0));
            }

            if (participants.containsKey(name)) {

                Matcher digits = second.matcher(input);
                int sum = 0;

                while (digits.find()) {
                    sum += Integer.parseInt(String.valueOf(digits.group(0)));
                }

                participants.put(name, participants.get(name) + sum);
            }

            input = scanner.nextLine();
        }

        Map<String, Integer> unsortedMap = participants;

        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        List<String> winners = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : reverseSortedMap.entrySet()) {
            winners.add(entry.getKey());
        }

        System.out.printf("1st place: %s%n", winners.get(0));
        System.out.printf("2nd place: %s%n", winners.get(1));
        System.out.printf("3rd place: %s%n", winners.get(2));

    }


}


