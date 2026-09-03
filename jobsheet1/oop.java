package jobsheet1;

class Product {

    private final String itemName;
    private final float price;

    public Product(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
    }

    public float total(int quantity) {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }
    
}

public class oop {
    public static void main(String[] args) {
        Product product1 = new Product("Coffee", 120000.0f);
        int quantity1 = 3;

        Product product2 = new Product("Sugar", 30000.0f);
        int quantity2 = 1;

        System.out.println(product1.getItemName() + ": " + product1.total(3));
        System.out.println(product2.getItemName() + ": " + product2.total(1));
    }
}
