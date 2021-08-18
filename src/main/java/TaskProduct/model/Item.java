package TaskProduct.model;

import java.util.Objects;

public class Item {
    private String nameItem;
    private double price;
    private int total;

    public Item() {
    }

    public Item(String nameItem, double price, int total) {
        this.nameItem = nameItem;
        this.price = price;
        this.total = total;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getPriceSum(){
        return price*total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 && total == item.total && Objects.equals(nameItem, item.nameItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameItem, price, total);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + nameItem + '\'' +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}
