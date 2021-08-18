package TaskProduct.service.filehandler;

import TaskProduct.model.ItemList;
import TaskProduct.service.comparator.ItemListComparatorByName;
import TaskProduct.service.comparator.ItemListComparatorByUniqueSum;
import TaskProduct.service.format.item.ItemListFormat;
import TaskProduct.service.format.item.PrintItemListFormat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class ItemWriter {
    public void writeItemData(List<ItemList> itemLists, String filename){
        Comparator<ItemList> comparatorByName = new ItemListComparatorByName();
        Comparator<ItemList> comparatorByUniqueSum = new ItemListComparatorByUniqueSum();
        itemLists.sort(comparatorByName.thenComparing(comparatorByUniqueSum));
        PrintItemListFormat format = new ItemListFormat();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (ItemList itemL : itemLists) {
                writer.write(format.formatItemList(itemL) + "\n");
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
