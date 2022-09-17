package list.lab;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfProducts = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 1; i <= numberOfProducts; i++) {
            products.add(scanner.nextLine());
        }

        Collections.sort(products);

        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.printf("%d.%s%n", i, products.get(i + 1));
        }

    }


}

