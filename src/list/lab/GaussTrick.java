package list.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class GaussTrick {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .toList();

        List<Double> newElements = new ArrayList<>();

        if (numbers.size() % 2 == 0) {

            for (int i = 0; i < numbers.size() / 2; i++) {
                newElements.add(numbers.get(i) + numbers.get(numbers.size() - 1 - i));
            }

        } else {

            for (int i = 0; i < numbers.size() / 2; i++) {
                newElements.add(numbers.get(i) + numbers.get(numbers.size() - 1 - i));
            }

            newElements.add((numbers.get(numbers.size() / 2)));
        }

        for (Double newElement : newElements) {
            System.out.print(new DecimalFormat("0.##").format(newElement) + " ");
        }

    }
}
