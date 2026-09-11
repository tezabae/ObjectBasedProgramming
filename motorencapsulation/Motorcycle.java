package motorencapsulation;

public class Motorcycle {

    // Private attributes
    private int speed;
    private boolean contactOn;

    // Constructor
    public Motorcycle() {
        speed = 0;
        contactOn = false;
    }

    // Turn on the engine
    public void startEngine() {
        contactOn = true;
        System.out.println("Engine is ON");
    }

    // Turn off the engine
    public void turnOffEngine() {
        contactOn = false;
        System.out.println("Engine is OFF");
    }

    // Increase speed
    public void addSpeed() {
        if (contactOn) {
            if (speed < 100) {
                speed += 10;
                System.out.println("Speed increased to " + speed + " km/h");
            } else {
                System.out.println("Speed cannot exceed 100 km/h!");
            }
        } else {
            System.out.println("Speed cannot increase due to Engine Off!");
        }
    }

    // Display motorcycle status
    public void printStatus() {
        System.out.println("Engine: " + (contactOn ? "ON" : "OFF"));
        System.out.println("Speed: " + speed + " km/h");
    }
}