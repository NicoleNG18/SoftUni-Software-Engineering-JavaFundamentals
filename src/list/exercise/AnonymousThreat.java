package list.exercise;

import java.util.*;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {

            String[] commandArray = command.split("\\s+");

            if (commandArray[0].equals("merge")) {
                merge(strings, commandArray);

            } else if (commandArray[0].equals("divide")) {
                divide(strings, commandArray);
            }

            command = scanner.nextLine();
        }

        for (String s : strings) {
            System.out.print(s + " ");
        }

    }

    private static void merge(List<String> strings, String[] commandArray) {
        int startIndex = Integer.parseInt(commandArray[1]);
        int endIndex = Integer.parseInt(commandArray[2]);
        StringBuilder newElement = new StringBuilder();

        if (startIndex < 0 || startIndex > strings.size() - 1) {
            startIndex = 0;
        }

        if (endIndex > strings.size() - 1) {
            endIndex = strings.size() - 1;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            newElement.append(strings.get(i));
        }

        strings.add(startIndex, newElement.toString());

        for (int i = startIndex; i <= endIndex; i++) {
            strings.remove(startIndex + 1);
        }

    }

    private static void divide(List<String> strings, String[] commandArray) {
        int index = Integer.parseInt(commandArray[1]);
        int partitions = Integer.parseInt(commandArray[2]);
        String help = strings.get(index);

        if (help.length() % partitions == 0) {
            int length = help.length() / partitions;

            List<String> partitionsList = new ArrayList<>();
            int helpIndexFirst = 0;

            for (int i = 0; i < partitions; i++) {
                int count = 0;
                StringBuilder helpElement = new StringBuilder();

                while (count < length) {
                    helpElement.append(help.charAt(helpIndexFirst));
                    count++;
                    helpIndexFirst++;
                }

                partitionsList.add(i, helpElement.toString());
            }

            strings.remove(index);

            for (String s : partitionsList) {
                strings.add(index, s);
                index++;
            }

        } else {

            int length1 = help.length() / partitions;

            String[] partArr = new String[partitions];
            Arrays.fill(partArr, "");

            int helpIndex = 0;

            for (int i = 0; i < partitions - 1; i++) {

                int count = 0;

                while (count < length1) {
                    partArr[i] += help.charAt(helpIndex);
                    count++;
                    helpIndex++;
                }

            }

            for (int k = helpIndex; k < help.length(); k++) {
                partArr[partArr.length - 1] += help.charAt(helpIndex);
                helpIndex++;
            }

            strings.remove(index);

            for (int i = 0; i < partArr.length; i++) {
                strings.add(i, partArr[i]);

            }

        }
    }


}



