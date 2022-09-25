package classesAndObjects.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(", ");
            Article current = new Article(input[0], input[1], input[2]);
            articles.add(current);
        }

        String command = scanner.nextLine();

        if (command.equals("title")) {
            articles.stream().sorted((ar1,ar2)->ar1.getTitle().compareTo(ar2.getTitle())).forEach(System.out::println);

        } else if (command.equals("content")) {
            articles.stream().sorted((ar1,ar2)->ar1.getContent().compareTo(ar2.getContent())).forEach(System.out::println);

        } else if (command.equals("author")) {
            articles.stream().sorted((ar1,ar2)->ar1.getAuthor().compareTo(ar2.getAuthor())).forEach(System.out::println);
        }

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

        public String getTitle() {
            return this.title;
        }

        public String getContent() {
            return this.content;
        }

        public String getAuthor() {
            return this.author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }

    }
}

