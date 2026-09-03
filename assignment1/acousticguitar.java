package assignment1;

public class acousticguitar extends guitar {
    // Two additional attributes
    String bodyMaterial;
    boolean hasPickup;

    // Constructor
    public acousticguitar(String brand, int numberOfStrings,
                          String bodyMaterial, boolean hasPickup) {
        super(brand, numberOfStrings);
        this.bodyMaterial = bodyMaterial;
        this.hasPickup = hasPickup;
    }

    // Method 1
    public void playAcoustic() {
        System.out.println("The acoustic guitar is played without an amplifier.");
    }

    // Method 2
    public void changeStrings() {
        System.out.println("The acoustic guitar strings are being changed.");
    }

    // Method 3: Show information
    @Override
    public void showInfo() {
        System.out.println("Acoustic Guitar Brand: " + brand);
        System.out.println("Number of Strings: " + numberOfStrings);
        System.out.println("Body Material: " + bodyMaterial);
        System.out.println("Has Pickup: " + hasPickup);
    }
}