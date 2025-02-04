package Exercise01_WorkingWithAbstraction.GreedyTimes_06;

import java.util.Objects;

public class Item {
    private ItemType itemType;
    private String name;
    private long amount;

    public Item(ItemType itemType, String name, long amount) {
        this.itemType = itemType;
        this.name = name;
        this.amount = amount;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return itemType == item.itemType && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemType, name, amount);
    }
}
