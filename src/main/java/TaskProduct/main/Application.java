package TaskProduct.main;

import TaskProduct.model.ItemList;
import TaskProduct.model.Storage;
import TaskProduct.service.filehandler.ItemWriter;
import TaskProduct.service.filehandler.StorageReader;
import TaskProduct.service.filehandler.StorageWriter;
import TaskProduct.service.format.item.ItemFormat;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        StorageReader storageReader = new StorageReader();
        StorageWriter storageWriter = new StorageWriter();
        ItemWriter itemWriter = new ItemWriter();
        ItemFormat itemFormat = new ItemFormat();
        List<Storage> storages = storageReader.getStoragesFromDataFile("C://Users/Admin Admin/Desktop/data.txt");
        storageWriter.writeStorageData(storages,"C://Users/Admin Admin/Desktop/st-total.txt", 2);
        List<ItemList> itemLists = itemFormat.getTotalList(storages);
        itemWriter.writeItemData(itemLists, "C://Users/Admin Admin/Desktop/product-report.txt");
    }
}
