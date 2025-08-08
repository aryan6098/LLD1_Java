package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        Clothing tShirt = new Clothing("C1", "T-Shirt", 19.99, 100, "M");
        items.add(tShirt);
        items.add(new Electronics("E1", "Laptop", 999.99, 5, 24));
        items.add(new Clothing("C2", "T-Shirt", 19.99, 109, "M"));
        items.add(new Book("B1", "Java", 59.99, 50, "Job Doe"));
        System.out.println(items.get(1).compareTo(items.get(2)));

    }
}
