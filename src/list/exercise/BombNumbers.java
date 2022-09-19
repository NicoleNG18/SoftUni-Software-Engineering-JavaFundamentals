package list.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        int bombNum = Integer.parseInt(String.valueOf(line.charAt(0)));
        int power = Integer.parseInt(String.valueOf(line.charAt(2)));

        while (numbers.contains(bombNum)) {

            for (int i = 0; i < numbers.size(); i++) {

                if (numbers.get(i) == bombNum) {

                    for (int j = 1; j <= power; j++) {

                        if ((numbers.indexOf(bombNum) - 1 >= 0 && numbers.indexOf(bombNum) - 1 < numbers.size())) {
                            numbers.remove(numbers.indexOf(bombNum) - 1);
                        }

                        if (numbers.indexOf(bombNum) + 1 < numbers.size()) {
                            numbers.remove(numbers.indexOf(bombNum) + 1);
                        }

                    }
                    numbers.remove((Integer) bombNum);
                }
            }

        }

        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}


