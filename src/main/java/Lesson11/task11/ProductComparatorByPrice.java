package Lesson11.task11;

import Lesson11.taskHome.model.Product;

import java.util.Comparator;

public class ProductComparatorByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
