package expeditioncargo;

public class Container {
    private String receiptNumber;
    private String ownerName;
    private double maxCapacity;
    private double currentLoadWeight;

    public Container(String receiptNumber, String ownerName, double maxCapacity) {
        this.receiptNumber = receiptNumber;
        this.ownerName = ownerName;
        this.maxCapacity = maxCapacity;
        this.currentLoadWeight = 0.0;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public double getCurrentLoadWeight() {
        return currentLoadWeight;
    }

    public void addLoad(double weight) {
        if (currentLoadWeight + weight > maxCapacity) {
            System.out.println("Sorry, the load weight exceeds the container's maximum capacity.");
            currentLoadWeight = 0.0;
        } else {
            currentLoadWeight += weight;
        }
    }

    public void unload(double weight) {
        if (weight <= currentLoadWeight) {
            currentLoadWeight -= weight;
        }
    }
}

