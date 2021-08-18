package TaskProduct.model;

import java.util.Objects;

public class ItemList {
    private String itemName;
    private String storageName;
    private double totalUniqueSum;

    public ItemList() {
    }

    public ItemList(String itemName, String storageName, double totalUniqueSum) {
        this.itemName = itemName;
        this.storageName = storageName;
        this.totalUniqueSum = totalUniqueSum;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public double getTotalUniqueSum() {
        return totalUniqueSum;
    }

    public void setTotalUniqueSum(double totalUniqueSum) {
        this.totalUniqueSum = totalUniqueSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemList itemList = (ItemList) o;
        return Double.compare(itemList.totalUniqueSum, totalUniqueSum) == 0 && Objects.equals(itemName, itemList.itemName) && Objects.equals(storageName, itemList.storageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, storageName, totalUniqueSum);
    }

    @Override
    public String toString() {
        return "ItemList{" +
                "itemName='" + itemName + '\'' +
                ", storageName='" + storageName + '\'' +
                ", totalUniqueSum=" + totalUniqueSum +
                '}';
    }
}
