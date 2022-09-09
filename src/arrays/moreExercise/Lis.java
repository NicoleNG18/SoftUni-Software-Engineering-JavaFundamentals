package arrays.moreExercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Lis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] lengthLis = new int[numbers.length];
        int[] previousIndex = new int[numbers.length];

        Arrays.fill(lengthLis, 1);
        Arrays.fill(previousIndex, -1);

        for (int currentIndex = 1; currentIndex < numbers.length; currentIndex++) {

            for (int prevIndex = 0; prevIndex < currentIndex; prevIndex++) {

                if (numbers[prevIndex] < numbers[currentIndex]) {

                    int candidateLength = lengthLis[prevIndex] + 1;

                    if (candidateLength > lengthLis[currentIndex]) {

                        lengthLis[currentIndex] = candidateLength;
                        previousIndex[currentIndex] = prevIndex;

                    }
                }
            }
        }

        int maximumLength = 0;
        int maxLengthIndex = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (lengthLis[i] > maximumLength) {

                maximumLength = lengthLis[i];
                maxLengthIndex = i;

            }

        }

        List<Integer> finalLine = new ArrayList<>();

        for (int i = 0; i < maximumLength; i++) {

            finalLine.add(numbers[maxLengthIndex]);
            maxLengthIndex = previousIndex[maxLengthIndex];

        }

        for (int i = finalLine.size() - 1; i >= 0; i--) {
            System.out.print(finalLine.get(i) + " ");
        }

    }
}

