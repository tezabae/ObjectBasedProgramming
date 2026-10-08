package jobsheet9.experiment1;

public class Utama {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager man[] = new Manager[2];
        Staff staff1[] = new Staff[2];

        // 1. Buat data Manager pertama
        man[0] = new Manager();
        man[0].setNama("Rizki Adam Kurniawan");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");

        // 2. Buat data Manager kedua
        man[1] = new Manager();
        man[1].setNama("John Doe");
        man[1].setNip("102");
        man[1].setGolongan("2");
        man[1].setTunjangan(6000000);
        man[1].setBagian("Keuangan");

        // 3. Buat data Staff untuk Manager pertama
        staff1[0] = new Staff();
        staff1[0].setNama("Rizki Adam Kurniawan");
        staff1[0].setNip("101");
        staff1[0].setGolongan("1");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);

        staff1[1] = new Staff();
        staff1[1].setNama("Rizki Adam Kurniawan");
        staff1[1].setNip("102");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(55000);

        // 4. Hubungkan daftar Staff ke Manager pertama
        man[0].setStaff(staff1); 

        // 5. Cetak info manager (otomatis cetak staff bawahannya)
        man[0].lihatInfo();
        man[1].lihatInfo();
    }
}