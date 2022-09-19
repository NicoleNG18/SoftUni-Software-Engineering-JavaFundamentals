package list.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(strings);

        String text = "";

        for (String string : strings) {
            text += string;
            text += " ";
        }
        text = text.trim();

        List<Integer> numbers = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).toList();

        for (int num : numbers) {
            System.out.printf("%d ", num);
        }

    }
}
