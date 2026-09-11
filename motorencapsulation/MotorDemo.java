package motorencapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motorcycle motor = new Motorcycle();

        motor.printStatus();

        motor.startEngine();

        motor.addSpeed();
        motor.addSpeed();
        motor.addSpeed();

        motor.printStatus();

        motor.turnOffEngine();

        motor.printStatus();
    }
}