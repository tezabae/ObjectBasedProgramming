package jobsheet2;

public class barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;

    public void tampilkanBarang() {
        System.out.println("Nama Barang: " + namaBrg);
        System.out.println("Jenis Barang: " + jenisBrg);
        System.out.println("Stok: " + stok);
    }

    //method argumen dan nilai balik(return)

    public int tambahStok(int brgMasuk) {
    int stokBaru = stok + brgMasuk;
    return stokBaru;
    }
}
