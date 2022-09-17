package list.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        List<Integer> thirdList = new ArrayList<>();
        int index = 0;

        while (index < firstList.size() || index < secondList.size()) {

            if (index < firstList.size()) {
                thirdList.add(firstList.get(index));
            }

            if (index < secondList.size()) {
                thirdList.add(secondList.get(index));
            }

            index++;

        }

        for (Object num : thirdList) {
            System.out.print(num + " ");
        }

    }

}


