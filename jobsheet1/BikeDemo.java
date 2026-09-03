package jobsheet1;

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike = new Bike();
        Bike mountainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        // Bike 1
        mountainBike.setBrand("Trek");
        mountainBike.gearChanges(2);
        mountainBike.speedAcceleration(10);
        mountainBike.printBikeInfo();

        System.out.println();

        // Bike 2
        mountainBike2.setBrand("Giant");
        mountainBike2.gearChanges(3);
        mountainBike2.speedAcceleration(20);
        mountainBike2.printBikeInfo();

        System.out.println();

        // Road Bike
        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.gearChanges(4);
        roadBike1.speedAcceleration(15);
        roadBike1.printBikeInfo();
    }
}