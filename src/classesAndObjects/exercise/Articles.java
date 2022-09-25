package classesAndObjects.exercise;

import java.util.Scanner;

public class Articles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        Article article = new Article(input[0], input[1], input[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            String[] command = scanner.nextLine().split(": ");

            if (command[0].equals("Edit")) {
                article.Edit(command[1]);

            } else if (command[0].equals("ChangeAuthor")) {
                article.ChangeAuthor(command[1]);

            } else if (command[0].equals("Rename")) {
                article.Rename(command[1]);
            }

        }

        article.getData();

    }

    static class Article {
        private String title;
        private String content;
        private String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void Edit(String s) {
            this.content = s;
        }

        public void ChangeAuthor(String s) {
            this.author = s;
        }

        public void Rename(String s) {
            this.title = s;
        }

        public void getData() {
            System.out.printf("%s - %s: %s", this.title, this.content, this.author);
        }

    }


}

