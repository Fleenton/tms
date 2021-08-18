package Lesson11.task8;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Product toy1 = new Product("машинка", "колеса");
        Product toy2 = new Product("кукла", "парик");
        Product toy3 = new Product("вертолетик", "лопасти");
        Product toy4 = new Product("самокат", "колеса");
        Product toy5 = new Product("плюшевый медведь", "вата");
        HashMap<String, String> toyList = new HashMap();
        toyList.put(toy1.getNameToy(), toy1.getObjectToy());
        toyList.put(toy2.getNameToy(), toy2.getObjectToy());
        toyList.put(toy3.getNameToy(), toy3.getObjectToy());
        toyList.put(toy4.getNameToy(), toy4.getObjectToy());
        toyList.put(toy5.getNameToy(), toy5.getObjectToy());
        PrintEntry.printEntry(toyList);
        System.out.println("==============");
        PrintKey.printKey(toyList);
        System.out.println("==============");
        PrintValues.printValues(toyList);
    }
}
