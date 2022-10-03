package stringBuilder.exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String filePath = scanner.nextLine();

        System.out.printf("File name: %s%n", filePath.substring(filePath.lastIndexOf("\\") + 1, filePath.indexOf(".")));
        System.out.printf("File extension: %s", filePath.substring(filePath.indexOf(".") + 1));
    }

}

