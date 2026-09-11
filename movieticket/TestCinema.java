package movieticket;

public class TestCinema {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("Avengers: Endgame", -50000);
        System.out.println("Movie: " + ticket1.getMovieTitle());
        System.out.println("Ticket Price: " + ticket1.getBasePrice());
        System.out.println("Is Paid? " + ticket1.isPaymentStatus());
        
        System.out.println("\nProcessing payment...");
        ticket1.processPayment();
        System.out.println("Updated Payment Status? " + ticket1.isPaymentStatus());
    }
}
