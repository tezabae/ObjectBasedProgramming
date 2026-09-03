package jobsheet2;

public class testbarang2 {
     public static void main(String[] args) {

        barang2 product1 = new barang2();

        product1.kode = "B001";
        product1.namaBarang = "Laptop";
        product1.hargaDasar = 5000000;
        product1.diskon = 10;

        product1.tampilData();
    }
}
