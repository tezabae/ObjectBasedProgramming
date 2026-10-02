package quiz1;

public class Generator {
    private int Daya;
    private int Voltase;

    public Generator(int Daya, int Voltase) {
        this.Daya = Daya;
        this.Voltase = Voltase;
    }

    public int getDaya() {
        return Daya;
    }

    public void setDaya(int Daya) {
        this.Daya = Daya;
    }

    public int getVoltase() {
        return Voltase;
    }

    public void setVoltase(int Voltase) {
        this.Voltase = Voltase;
    }
}
