package TaskProduct.service.comparator;

import TaskProduct.model.ItemList;

import java.util.Comparator;

public class ItemListComparatorByUniqueSum implements Comparator<ItemList> {
    @Override
    public int compare(ItemList o1, ItemList o2) {
        return (int) (o1.getTotalUniqueSum() - o2.getTotalUniqueSum());
    }
}
