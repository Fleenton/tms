package Lesson11.taskHome.model;

import java.util.Comparator;

public class ProductComparatorByPrice implements Comparator <Product> {
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
