package TaskProduct.service.comparator;

import TaskProduct.model.ItemList;

import java.util.Comparator;

public class ItemListComparatorByName implements Comparator<ItemList> {
    @Override
    public int compare(ItemList o1, ItemList o2) {
        return o1.getItemName().compareTo(o2.getItemName());
    }
}
