package jobsheet2;

public class testbarang {
    public static void main(String[] args) {
        barang brg1 = new barang();
        brg1.namaBrg = "pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilkanBarang();

        System.out.println("Stok baru setelah penambahan: " + brg1.tambahStok(20));
    }
}
