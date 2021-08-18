package Lesson11.taskHome.run;

import Lesson11.task11.ProductComparatorByPrice;
import Lesson11.taskHome.model.Product;
import Lesson11.taskHome.model.Shop;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setProduct(new Product(1, "Boots", 500));
        shop.setProduct(new Product(2, "Apple", 100));
        shop.setProduct(new Product(3, "Dog", 80000000));
        shop.setProduct(new Product(4, "Auto", 1500));

        System.out.println(shop);
        shop.deleteProduct(1);
        System.out.println(shop);

        for (int i = shop.getAllProduct().size()-1; i>=0; i--){
            System.out.println(shop.getAllProduct().get(i));
        }

        shop.changeProduct(new Product(4, "Home", 150000));
        System.out.println(shop);

        Comparator comparator = new ProductComparatorByPrice();
        shop.getAllProduct().sort(comparator);
        System.out.println(shop);
    }
}
