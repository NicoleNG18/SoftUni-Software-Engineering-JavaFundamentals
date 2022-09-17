package list.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String s : inputArray) {

            if (Integer.parseInt(s) > 0) {
                numbers.add(Integer.parseInt(s));
            }

        }

        if (numbers.size() == 0) {
            System.out.println("empty");

        } else {
            Collections.reverse(numbers);

            for (int s : numbers) {
                System.out.print(s + " ");
            }

        }
    }


}

