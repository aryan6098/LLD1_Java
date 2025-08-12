package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        Clothing tShirt = new Clothing("C1", "T-Shirt", 1900, 100, "M");
        items.add(tShirt);
        items.add(new Electronics("E1", "Laptop", 999.99, 5, 24));
        items.add(new Clothing("C2", "T-Shirt", 19.99, 109, "M"));
        items.add(new Book("B1", "Java", 59.99, 50, "Job Doe"));
//        System.out.println(items.get(1).compareTo(items.get(2)));
    /*
    Print all item IDs in the inventory using map.
    Use map and forEach to execute it

     */
      List<String> ids =  items.stream().map((x) -> x.getId()).collect(Collectors.toList());
        ids.forEach(x -> System.out.println( " "+ x ));

        /*
        Create a list of item names in lowercase and print it.
        Hint : Use toLowerCase method of String along with map
         */

      List<String> nameList = items.stream().map(x -> x.getName().toLowerCase()).toList();
      nameList.forEach(name -> System.out.println("Item Name: "+ name));

        /*
        Generate a list of the lengths of item names.
        Use length method of String along with map
         */
        List<Integer> nameLength = items.stream().map(x -> x.getName().length()).toList();
        nameLength.forEach(name -> System.out.println("Name Length: "+ name));

        /*
        Find all items priced above 1000 and print their details.
        */

        List<Item> filterList = items.stream().filter(x -> x.getPrice() > 1000).toList();
        for (Item x : filterList) {
            System.out.println(x.getName());
        }
        String maxPriceItemName = items.stream()
                        .reduce((item1, item2) -> item1.getPrice() > item2.getPrice() ? item1 : item2).get().getName();

        System.out.println(maxPriceItemName);

        Optional<Item> optionalItem =  items.stream()
                .reduce((item1, item2) -> item1.getPrice() > item2.getPrice() ? item1 : item2);

        optionalItem.ifPresent(item -> System.out.println("1"+ item.getName()));



    }
}
