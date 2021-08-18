package Lesson11.task11;

import java.util.Comparator;

public class ProductComparatorByName implements Comparator<ProductList> {
    public int compare(ProductList o1, ProductList o2) {
        return o1.getNameProduct().compareTo(o2.getNameProduct());
    }
}
