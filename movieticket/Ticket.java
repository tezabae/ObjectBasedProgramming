package movieticket;

public class Ticket {
   private String movieTitle;
    private double basePrice;
    private boolean paymentStatus;

    public Ticket(String movieTitle, double basePrice) {
        this.movieTitle = movieTitle;
        if (basePrice < 0) {
            this.basePrice = 35000;
        } else {
            this.basePrice = basePrice;
        }
        this.paymentStatus = false;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void processPayment() {
        this.paymentStatus = true;
    } 
}
