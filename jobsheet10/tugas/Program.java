package jobsheet10.tugas;

public class Program {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Keledai", 4, "Hehehehe", "Grey");
        keledai.displayData();

        Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum Hauum", "Black");
        gorilla.displayData();

        Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar", "Brown");
        singa.displayData();
    }
}