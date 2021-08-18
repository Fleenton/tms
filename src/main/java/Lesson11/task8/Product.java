package Lesson11.task8;

import java.util.Objects;

public class Product {
    private String nameToy;
    private String objectToy;

    public Product() {
    }

    public Product(String nameToy, String objectToy) {
        this.nameToy = nameToy;
        this.objectToy = objectToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    public String getObjectToy() {
        return objectToy;
    }

    public void setObjectToy(String objectToy) {
        this.objectToy = objectToy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameToy, product.nameToy) && Objects.equals(objectToy, product.objectToy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameToy, objectToy);
    }
}
