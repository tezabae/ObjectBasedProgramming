package assignment1;

public class electricguitar extends guitar {
    // Two additional attributes
    String pickupType;
    String color;

    // Constructor
    public electricguitar(String brand, int numberOfStrings,
                          String pickupType, String color) {
        super(brand, numberOfStrings);
        this.pickupType = pickupType;
        this.color = color;
    }

    // Method 1
    public void connectAmplifier() {
        System.out.println("The electric guitar is connected to an amplifier.");
    }

    // Method 2
    public void useEffect() {
        System.out.println("The electric guitar is using an effect.");
    }

    // Method 3: Show information
    @Override
    public void showInfo() {
        System.out.println("Electric Guitar Brand: " + brand);
        System.out.println("Number of Strings: " + numberOfStrings);
        System.out.println("Pickup Type: " + pickupType);
        System.out.println("Color: " + color);
    }
}

