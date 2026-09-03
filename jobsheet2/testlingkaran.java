package jobsheet2;

public class testlingkaran {
      public static void main(String[] args) {

        lingkaran lingkaran1 = new lingkaran();

        lingkaran1.phi = 3.14;
        lingkaran1.r = 7;

        System.out.println("Luas Lingkaran     : " + lingkaran1.hitungLuas());
        System.out.println("Keliling Lingkaran : " + lingkaran1.hitungKeliling());
    }
}
