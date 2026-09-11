package expeditioncargo;

public class TestLogistics {
    public static void main(String[] args) {
        Container containerAlfa = new Container("REQ-9988", "PT. Maju Bersama", 5000);
        System.out.println("Container Owner Name: " + containerAlfa.getOwnerName());
        System.out.println("Maximum Capacity: " + containerAlfa.getMaxCapacity() + "kg");
        
        System.out.println("\nAdding a new load of 6,000 kg...");
        containerAlfa.addLoad(6000);
        System.out.println("Current load weight: " + containerAlfa.getCurrentLoadWeight() + "kg");
        
        System.out.println("\nAdding a new load of 4,000 kg...");
        containerAlfa.addLoad(4000);
        System.out.println("Current load weight: " + containerAlfa.getCurrentLoadWeight() + "kg");
        
        System.out.println("\nUnloading goods weighing 500 kg...");
        containerAlfa.unload(500);
        System.out.println("Current load weight: " + containerAlfa.getCurrentLoadWeight() + "kg");
        
        System.out.println("\nUnloading goods weighing 1,500 kg...");
        containerAlfa.unload(1500);
        System.out.println("Current load weight: " + containerAlfa.getCurrentLoadWeight() + "kg");
    }
}

