package TaskProduct.service.comparator;

import TaskProduct.model.Storage;

import java.util.Comparator;

public class StorageComparatorByPrice implements Comparator<Storage> {
    @Override
    public int compare(Storage o1, Storage o2) {
        return (int) (o2.getTotalSum() - o1.getTotalSum());
    }
}
