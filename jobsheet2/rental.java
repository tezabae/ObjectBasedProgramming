package jobsheet2;

public class rental {
    int id;
    String memberName;
    String gameName;
    double pricePerDay;
    int rentingDuration;
    double amountToPay;

    public double calculatePayment() {
        amountToPay = pricePerDay * rentingDuration;
        return amountToPay;
    }

    public void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Member Name: " + memberName);
        System.out.println("Game Name: " + gameName);
        System.out.println("Price Per Day: " + pricePerDay);
        System.out.println("Renting Duration: " + rentingDuration);
        System.out.println("Amount to Pay: " + calculatePayment());
    }
}
