package TaskProduct.service.format.item;

import TaskProduct.model.ItemList;
import TaskProduct.model.Storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemFormat {
    public List<ItemList> getTotalList (List<Storage> storages){
        List<ItemList> result = new ArrayList<>();
        for (Storage st: storages) {
            for (Map.Entry<String, Double> entry : st.getUniqueItemWithSum().entrySet()) {
                ItemList itemList = new ItemList(entry.getKey(), st.getNameStorage(), entry.getValue());
                result.add(itemList);
            }
        }
        return result;
    }
}
