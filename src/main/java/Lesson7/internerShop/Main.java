package Lesson7.internerShop;

public class Main {
    public static void main(String[] args) {
        Category category = new Category("Продукты питания");
        Category category1 = new Category("Хозяйсвенные товары");
        Category category2 = new Category("Электроника");

        Product product = new Product("Печенье Roshen", 1.50, 4);
        Product product1 = new Product("Напиток Coca-Cola", 2.30, 5);
        Product product2 = new Product("Стиральный порошок Persil", 13.7, 3);
        Product product3 = new Product("Средство для мытья посуды Fairy", 3.50, 4);
        Product product4 = new Product("Телевизор Samsung", 1199.99,4);
        Product product5 = new Product("Пылесос LG", 330.50, 3);

        Product [] products = {product, product1, product2, product3, product4, product5};
    }
}
