package Lesson11.task11;

import java.util.Objects;

public class ProductList {
    private String nameProduct;
    private double priceProduct;
    private double ratingProduct;

    public ProductList() {
    }

    public ProductList(String nameProduct, double priceProduct, double ratingProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.ratingProduct = ratingProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public double getRatingProduct() {
        return ratingProduct;
    }

    public void setRatingProduct(double ratingProduct) {
        this.ratingProduct = ratingProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return priceProduct == that.priceProduct && Double.compare(that.ratingProduct, ratingProduct) == 0 && Objects.equals(nameProduct, that.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, priceProduct, ratingProduct);
    }

    @Override
    public String toString() {
        return "Название товара: " + getNameProduct() + "\n" + "Цена товара: " + getPriceProduct() + " р." + "\n" + "Рейтинг товара в нашем магазине: " + getRatingProduct() + "\n";
    }
}
