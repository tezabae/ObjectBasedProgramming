package expeditioncargo;

import java.util.Scanner;

public class TestLogisticsScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container containerAlfa = new Container("REQ-9988", "PT. Maju Bersama", 5000);
        
        System.out.println("Container Owner Name: " + containerAlfa.getOwnerName());
        System.out.println("Maximum Capacity: " + containerAlfa.getMaxCapacity() + "kg");
        
        System.out.print("\nEnter the weight of the load to add (kg): ");
        double add1 = scanner.nextDouble();
        containerAlfa.addLoad(add1);
        System.out.println("Current load weight: " + containerAlfa.getCurrentLoadWeight() + "kg");
        
        System.out.print("\nEnter the weight of the next load to add (kg): ");
        double add2 = scanner.nextDouble();
        containerAlfa.addLoad(add2);
        System.out.println("Current load weight: " + containerAlfa.getCurrentLoadWeight() + "kg");
        
        System.out.print("\nEnter the weight of the goods to unload (kg): ");
        double unload1 = scanner.nextDouble();
        containerAlfa.unload(unload1);
        System.out.println("Current load weight: " + containerAlfa.getCurrentLoadWeight() + "kg");
        
        scanner.close();
    }
}