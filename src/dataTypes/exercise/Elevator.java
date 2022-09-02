package dataTypes.exercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());


        System.out.println((int) Math.ceil((double) numberOfPeople / capacity));
    }
}

