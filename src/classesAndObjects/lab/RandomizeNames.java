package classesAndObjects.lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] line=scanner.nextLine().split("\\s+");

        Random rnd=new Random();

        for(int i=0;i<line.length;i++){

            int rnd2= rnd.nextInt(line.length);
            String help=line[i];

            line[i]=line[rnd2];
            line[rnd2]=help;
        }

        for (String s:line) {
            System.out.println(s);
        }

    }
}

