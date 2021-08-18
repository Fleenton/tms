package Lesson11.taskHome.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> productList = new ArrayList<>();

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void setProduct(Product product){
        for (Product products : productList) {
            if (products.getId() == product.getId()){
                System.out.println("Такой ид уже существует");
                break;
            }
        }
        productList.add(product);
    }

    public List<Product> getAllProduct(){
        return productList;
    }

    public void deleteProduct(int id){
        List<Product> badId = new ArrayList<>();
        for (Product products : productList){
            if (products.getId() == id){
                badId.add(products);
            }
        }
        productList.removeAll(badId);
    }

    public void changeProduct(Product product){
        for (Product products : productList) {
            if (products.getId() == product.getId()){
                products.setName(product.getName());
                products.setPrice(product.getPrice());
            }
        }
    }

    public void replaceProduct(int id, String name, int idNew){
        for (Product a : productList){
            if (a.getId() == id){
                a.setId(idNew);
                a.setName(name);
            }
        }
    }

    @Override
    public String toString() {
        return "Перечень товара: " + "\n" + productList;
    }
}
