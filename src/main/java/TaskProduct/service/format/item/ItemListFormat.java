package TaskProduct.service.format.item;

import TaskProduct.model.ItemList;

public class ItemListFormat implements PrintItemListFormat {
    @Override
    public String formatItemList(ItemList itemList) {
        return itemList.getItemName() + " - " + itemList.getStorageName() + " - " + itemList.getTotalUniqueSum();
    }
}
