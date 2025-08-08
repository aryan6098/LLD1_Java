package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory <T extends Item>{
    private HashMap<String, T> items;

    public Inventory(){
        items = new HashMap<>();
    }

    public  void addItem(T item) throws invalidQuantityException {
        if(item.getQuantity() < 0) {
            throw new invalidQuantityException("Quantity is less than equal to zero which is invalid");
        }
        if(items.containsKey(item.getId())) {
            throw new invalidQuantityException("Item " + item.getId()+ " already exist");
        }
        items.put(item.getId(), item);
    }

    public void removeItem(T item) {
        items.remove(item.getId());
    }

    public T get(String id) {
        return items.get(id);
    }

    public List<T> getAll() {

        return new ArrayList<>(items.values());

    }


}
