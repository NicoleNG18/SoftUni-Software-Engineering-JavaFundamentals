package list.lab;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        int size=0;

        while (elements.size() !=size) {

            size= elements.size();
            int index = 0;

            while (index < elements.size()-1) {

                if (elements.get(index).equals(elements.get(index + 1))) {
                    elements.set(index,elements.get(index) + elements.get(index + 1));
                    elements.remove(index+1);

                }

                index ++;
            }

        }

        for (Double element : elements) {
            System.out.print(new DecimalFormat("0.##").format(element) + " ");
        }

    }

}

