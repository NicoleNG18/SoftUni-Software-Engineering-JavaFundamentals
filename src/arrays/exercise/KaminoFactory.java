package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dnaLength = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        String[] sequenceArray = new String[100];
        int countSize = 0;

        while (!input.equals("Clone them!")) {

            sequenceArray[countSize] = input;
            countSize++;

            input = scanner.nextLine();
        }

        int[] arraySums = new int[countSize];
        int[] arrayIndex = new int[countSize];
        int[] arrayMax = new int[countSize];

        for (int i = 0; i < countSize; i++) {

            String[] arrayAsStrings = sequenceArray[i].split("!+");
            int[] arrayAsInt = new int[dnaLength];

            for (int j = 0; j < dnaLength; j++) {
                arrayAsInt[j] = Integer.parseInt(arrayAsStrings[j]);
            }

            int currentCount = 1;
            int max = 1;
            int sumElements = 0;
            int myIndex = 0;

            for (int j : arrayAsInt) {
                sumElements += j;
            }

            for (int element = 0; element < arrayAsInt.length - 1; element++) {

                if (arrayAsInt[element] == arrayAsInt[element + 1] && arrayAsInt[element + 1] == 1) {

                    if (currentCount == 1) {
                        myIndex = element;
                    }

                    currentCount++;

                    if (currentCount > max) {
                        max = currentCount;
                    }

                } else {
                    currentCount = 1;
                }

            }

            arrayMax[i] = max;
            arrayIndex[i] = myIndex;
            arraySums[i] = sumElements;

        }

        int maximumMax = 0;
        int maximumMaxIndex = 0;

        for (int numOfSequence = 0; numOfSequence < countSize; numOfSequence++) {

            if (arrayMax[numOfSequence] > maximumMax) {

                maximumMax = arrayMax[numOfSequence];
                maximumMaxIndex = numOfSequence;

            } else if (arrayMax[numOfSequence] == maximumMax) {

                if (arrayIndex[numOfSequence] < arrayIndex[maximumMaxIndex]) {

                    maximumMaxIndex = numOfSequence;

                } else if (arrayIndex[numOfSequence] == arrayIndex[maximumMaxIndex]) {

                    if (arraySums[numOfSequence] > arraySums[maximumMaxIndex]) {
                        maximumMaxIndex = numOfSequence;
                    }

                }
            }
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", (maximumMaxIndex + 1), arraySums[maximumMaxIndex]);

        String[] finalArray = sequenceArray[maximumMaxIndex].split("!+");
        StringBuilder finalString = new StringBuilder();

        for (String s : finalArray) {
            finalString.append(s).append(" ");
        }

        System.out.printf("%s", finalString);

    }
}


