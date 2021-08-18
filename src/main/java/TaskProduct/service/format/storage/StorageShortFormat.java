package TaskProduct.service.format.storage;

import TaskProduct.model.Storage;
import TaskProduct.service.format.storage.PrintStorageFormat;

public class StorageShortFormat implements PrintStorageFormat {
    @Override
    public String getFormatStorage(Storage storage) {
        return storage.getNameStorage() + " - " + storage.getTotalSum() + "\n";
    }
}
