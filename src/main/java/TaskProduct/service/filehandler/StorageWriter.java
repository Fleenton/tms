package TaskProduct.service.filehandler;

import TaskProduct.model.Storage;
import TaskProduct.service.comparator.StorageComparatorByPrice;
import TaskProduct.service.format.storage.StorageLongFormat;
import TaskProduct.service.format.storage.PrintStorageFormat;
import TaskProduct.service.format.storage.StorageShortFormat;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class StorageWriter {
    public void writeStorageData(List<Storage> storages,String filename, int value){
        Comparator<Storage> comparator = new StorageComparatorByPrice();
        storages.sort(comparator);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            PrintStorageFormat printStorageFormat = null;
            if (value == 1){
                printStorageFormat = new StorageShortFormat();
            }
            if (value == 2){
                printStorageFormat = new StorageLongFormat();
            }
            for (Storage st: storages) {
                writer.write(printStorageFormat.getFormatStorage(st));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
