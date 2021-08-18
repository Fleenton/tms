package Lesson11.task11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProductList> productList = new ArrayList<>();
        productList.add(new ProductList("Часы", 5.99, 3.4));
        productList.add(new ProductList("Утюг", 3.5, 4.0));
        productList.add(new ProductList("Фен", 7.8, 2.5));
        productList.add(new ProductList("Шариковая ручка", 0.5, 4.1));
        productList.add(new ProductList("Ваза", 10.5, 3.2));

        Comparator comparator = new ProductComparatorByName();
        Comparator comparator1 = new ProductComparatorByPrice();
        Comparator comparator2 = new ProductComparatorByRating();

        productList.sort(comparator);
        for (ProductList productList1 : productList) {
            System.out.println(productList1);
        }

        System.out.println("========================================================================");

        productList.sort(comparator1);
        for (ProductList productList1 : productList) {
            System.out.println(productList1);
        }

        System.out.println("========================================================================");

        productList.sort(comparator2);
        for (ProductList productList1 : productList) {
            System.out.println(productList1);
        }
    }
}
