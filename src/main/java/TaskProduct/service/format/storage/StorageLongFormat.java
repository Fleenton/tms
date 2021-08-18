package TaskProduct.service.format.storage;

import TaskProduct.model.Storage;
import TaskProduct.service.format.storage.PrintStorageFormat;

public class StorageLongFormat implements PrintStorageFormat {
    @Override
    public String getFormatStorage(Storage storage) {
        return storage.getNameStorage() + " - " + storage.getTotalSum() + " - " + storage.getCountItems() + "\n";
    }
}
