package TaskProduct.service.filehandler;

import TaskProduct.model.Item;
import TaskProduct.model.Storage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StorageReader {
    public List<Storage> getStoragesFromDataFile (String fileName){
        List<Storage> result = new ArrayList<>();
        result.add(new Storage("ST1"));
        result.add(new Storage("ST2"));
        result.add(new Storage("ST3"));
        result.add(new Storage("ST4"));

        try {
            BufferedReader inReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = inReader.readLine()) != null) {
                String[] arrItem = line.split(" - ");
                Item item = new Item();
                item.setNameItem(arrItem[0]);
                item.setPrice(Double.parseDouble(arrItem[2]));
                item.setTotal(Integer.parseInt(arrItem[3]));
                for (Storage storage : result) {
                    if (storage.getNameStorage().equals(arrItem[1])){
                        storage.getItems().add(item);
                        break;
                    }
                }
            }
            inReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
