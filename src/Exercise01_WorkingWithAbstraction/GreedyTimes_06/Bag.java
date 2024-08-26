package Exercise01_WorkingWithAbstraction.GreedyTimes_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bag {

    private List<Item> items;
    private long capacity;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(this.items);
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public void add(Item itemToAdd) {
        if (canAdd(itemToAdd)){

            Item item = getItem(itemToAdd);

            if (item == null){
                this.items.add(item);
            } else {
                item.setAmount(item.getAmount() + itemToAdd.getAmount());
            }

        }
    }

    private Item getItem(Item itemToAdd) {
        return this.items.stream()
                .filter(i -> i.equals(itemToAdd))
                .findFirst()
                .orElse(null);
    }

    private boolean canAdd(Item item) {
        if (this.capacity < getTotalAmount() + item.getAmount()){
            return false;
        }
        if (item.getItemType() == null){
            return false;
        }
        switch (item.getItemType()){
            case Gem:
                if (item.getAmount() + getTotalAmountByType(ItemType.Gem) >
                        getTotalAmountByType(ItemType.Gold)){
                    return false;
                }
                break;
            case Cash:
                if (item.getAmount() + getTotalAmountByType(ItemType.Cash) >
                        getTotalAmountByType(ItemType.Gem)){
                    return false;
                }
                break;
        }
        return true;
    }

    private long getTotalAmountByType(ItemType itemType){
        return this.items.stream()
                .filter(item -> item.getItemType().equals(itemType))
                .mapToLong(Item::getAmount)
                .sum();
    }
    private long getTotalAmount() {
        return this.items.stream()
                .mapToLong(Item::getAmount)
                .sum();
    }
    public void print(){

    }
}
