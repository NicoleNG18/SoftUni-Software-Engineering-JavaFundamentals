package midExamPreparation;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        int sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        double average = sum * 1.0 / numbers.length;
        List<Double> listNumbers = new ArrayList<>();

        for (double number : numbers) {
            if (number > average) {
                listNumbers.add(number);
            }
        }

        if (listNumbers.size() == 0) {
            System.out.println("No");

        } else {

            Collections.sort(listNumbers);
            Collections.reverse(listNumbers);

            if (listNumbers.size() > 5) {

                for (int i = 0; i < 5; i++) {
                    System.out.printf("%.0f ", listNumbers.get(i));
                }

            } else {

                for (Double listNumber : listNumbers) {
                    System.out.printf("%.0f ", listNumber);
                }

            }

        }

    }


}
