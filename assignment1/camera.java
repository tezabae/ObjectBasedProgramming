package assignment1;

public class camera {
    // Two attributes of the camera class
    String brand;
    int megapixels;

    // Constructor to initialize the attributes
    public camera(String brand, int megapixels) {
        this.brand = brand;
        this.megapixels = megapixels;
    }

    // Method 1 (take a photo)
    public void takePhoto() {
        System.out.println("Taking a photo with the " + brand + " camera.");
    }

    // Method 2 (record a video)
    public void recordVideo() {
        System.out.println("Recording a video with the " + brand + " camera.");
    }

    // Method 3 (show camera specifications)
    public void showSpecifications() {
        System.out.println("Camera Brand: " + brand);
        System.out.println("Megapixels: " + megapixels + " MP");
    }
}
