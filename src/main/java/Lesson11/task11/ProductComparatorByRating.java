package Lesson11.task11;

import java.util.Comparator;

public class ProductComparatorByRating implements Comparator<ProductList> {
    @Override
    public int compare(ProductList o1, ProductList o2) {
        return (int) (o1.getRatingProduct() - o2.getRatingProduct());
    }
}
