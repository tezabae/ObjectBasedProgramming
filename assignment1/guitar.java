package assignment1;

public class guitar {
    // Two attributes
    String brand;
    int numberOfStrings;

    // Constructor
    public guitar(String brand, int numberOfStrings) {
        this.brand = brand;
        this.numberOfStrings = numberOfStrings;
    }

    // Method 1
    public void play() {
        System.out.println("The guitar is being played.");
    }

    // Method 2
    public void tune() {
        System.out.println("The guitar is being tuned.");
    }

    // Method 3: Show information
    public void showInfo() {
        System.out.println("Guitar Brand: " + brand);
        System.out.println("Number of Strings: " + numberOfStrings);
    }
}

