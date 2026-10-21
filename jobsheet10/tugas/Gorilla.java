package jobsheet10.tugas;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora {
    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Type: Carnivore + Herbivore");
        System.out.println("Food: Meat + Plants");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Name: " + nama);
        System.out.println("Number of Legs: " + jmlKaki);
        System.out.println("Sound: " + suara);
        System.out.println("Fur Colour: " + warnaBulu);
    }

    public void displayData() {
        displayMakan();
        displayBinatang();
        System.out.println("--------------------------------------------------");
    }
}