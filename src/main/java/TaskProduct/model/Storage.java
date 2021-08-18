package TaskProduct.model;

import java.util.*;
import java.util.stream.Collectors;

public class Storage {
    private String nameStorage;
    private List<Item> items = new ArrayList<>();

    public Storage() {
    }

    public Storage(String nameStorage) {
        this.nameStorage = nameStorage;
    }

    public String getNameStorage() {
        return nameStorage;
    }

    public void setNameStorage(String nameStorage) {
        this.nameStorage = nameStorage;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTotalSum(){
        /*double sum = 0.0;
        for (Item item : items) {
            sum += item.getPriceSum();
        }
        return sum;*/
        return items.stream().map(Item::getPriceSum).reduce((sum, price) -> sum += price).orElseThrow();
    }

    public int getCountItems(){
        /*int count = 0;
        for (Item item : items) {
            count += item.getTotal();
        }
        return count;*/
        return items.stream().map(Item::getTotal).reduce((count, total) -> count += total).orElseThrow();
    }

    public Map<String, Double> getUniqueItemWithSum(){
        Map<String, Double> map = items
                .stream()
                .collect(Collectors.toMap(Item::getNameItem, Item::getPriceSum));
        map.forEach((keyNameItems, valuePriceSum) -> valuePriceSum = Math.round(valuePriceSum*100)/100D);
        /*for (Item item : items) {
            double sum = item.getPriceSum();
            if (map.containsKey(item.getNameItem())){
                sum = map.get(item.getNameItem()) + item.getPriceSum();
            }
            map.put(item.getNameItem(), Math.round(sum*100)/100D);
        }*/
        return map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return Objects.equals(nameStorage, storage.nameStorage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameStorage);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "nameStorage='" + nameStorage + '\'' +
                ", countItem=" + items +
                '}';
    }
}
