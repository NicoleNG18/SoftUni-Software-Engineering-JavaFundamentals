package arrays.exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countVagoons = Integer.parseInt(scanner.nextLine());
        int[] passengers = new int[countVagoons];
        int sum = 0;

        for (int i = 0; i < countVagoons; i++) {
            passengers[i] = Integer.parseInt(scanner.nextLine());
            sum += passengers[i];
        }

        for (int j = 0; j < countVagoons; j++) {
            System.out.print(passengers[j] + " ");
        }

        System.out.println();
        System.out.println(sum);
    }
}


