package assignment1;

public class laptop {
    // Two attributes of the laptop class
    String brand;
    int ram;

    // Constructor to initialize the attributes
    public laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    // Method 1 (turn on the laptop)
    public void turnOn() {
        System.out.println("The " + brand + " laptop is now on.");
    }

    // Method 2 (open an application)
    public void openApplication(String appName) {
        System.out.println("Opening " + appName + " on the " + brand + " laptop.");
    }

    // Method 3 (show laptop specifications)
    public void showSpecifications() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
    }
}
