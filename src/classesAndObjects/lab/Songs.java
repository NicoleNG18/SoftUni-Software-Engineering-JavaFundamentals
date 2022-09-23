package classesAndObjects.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

    static class Song {
        String typeList;
        String name;
        String time;

        Song(String[] songs) {
            this.typeList = songs[0];
            this.name = songs[1];
            this.time = songs[2];
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numOfSongs; i++) {
            String[] current = scanner.nextLine().split("_");

            Song song = new Song(current);

            songs.add(song);
        }

        String finalCommand = scanner.nextLine();

        if (finalCommand.equals("all")) {

            for (Song s : songs) {
                System.out.println(s.name);
            }

        } else {

            for (Song s : songs) {
                if (s.typeList.equals(finalCommand)) {
                    System.out.println(s.name);
                }
            }

        }
    }


}

