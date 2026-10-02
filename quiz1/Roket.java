package quiz1;

public class Roket {

    private String Tipe;
    private int Power;

    public Roket(String tipe, int power) {
        this.Tipe = tipe;
        this.Power = power;
    }

    public String getTipe() {
        return Tipe;
    }

    public void setTipe(String tipe) {
        this.Tipe = tipe;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        this.Power = power;
    }
}