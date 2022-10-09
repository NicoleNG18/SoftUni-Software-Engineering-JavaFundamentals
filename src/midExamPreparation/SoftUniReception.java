package midExamPreparation;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstEff = Integer.parseInt(scanner.nextLine());
        int secondEff = Integer.parseInt(scanner.nextLine());
        int thirdEff = Integer.parseInt(scanner.nextLine());

        int efficiency = firstEff + secondEff + thirdEff;

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int time = 1;

        while (studentsCount > 0) {

            if(time %4!=0){
                studentsCount-=efficiency;
            }

            time++;
        }

        System.out.printf("Time needed: %dh.", time-1);
    }


}
