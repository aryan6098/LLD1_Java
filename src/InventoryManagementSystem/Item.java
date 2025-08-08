package InventoryManagementSystem;

public class Item implements Comparable<Item>{

   private String id;
   private String name;
   private double price;
   private int quantity;

    public Item(String  id, String name,double price, int quantity ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int compareTo(Item o) {

        int priceComparison = Double.compare(this.price, o.price);
        if(priceComparison != 0) {
            return priceComparison;
        }

        return this.name.compareTo(o.name);
    }


}
