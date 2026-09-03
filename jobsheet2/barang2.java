package jobsheet2;

public class barang2 {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    public int hitungHargaJual() {
        return (int) (hargaDasar - ((diskon / 100) * hargaDasar));
    }

    public void tampilData() {
        System.out.println("Code         : " + kode);
        System.out.println("Product Name : " + namaBarang);
        System.out.println("Base Price   : " + hargaDasar);
        System.out.println("Discount     : " + diskon + "%");
        System.out.println("Selling Price: " + hitungHargaJual());
    }
}

