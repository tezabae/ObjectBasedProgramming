package jobsheet1;

public class Bike {

    private String brand;
    private int speed;
    private int gear;

    // Gear 1: max 5 km/h, Gear 2: max 10 km/h, ... Gear 6: max 30 km/h
    private final int[] GEAR_SPEED_LIMITS = {5, 10, 15, 20, 25, 30};

    public void setBrand(String brandName) {
        this.brand = brandName;
    }

    public void gearChanges(int gearValue) {
        if (gearValue < 1 || gearValue > 6) {
            System.out.println(
                "Invalid gear value. Please enter a value between 1 and 6."
            );
        } else {
            gear = gearValue;
        }
    }

    public int speedAcceleration(int increment) {
        speed += increment;

        if (speed > GEAR_SPEED_LIMITS[gear - 1]) {
            speed = GEAR_SPEED_LIMITS[gear - 1];
        }

        return speed;
    }

    public int speedDeceleration(int decrement) {
        speed -= decrement;

        if (speed < 0) {
            speed = 0;
        }

        return speed;
    }

    public void printBikeInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Current Gear: " + gear);
    }
}