package jobsheet6.experiment5;

public class Staff extends Karyawan {
    // 1. Tambahkan deklarasi variabel lembur dan potongan di sini
    public int lembur, potongan;

    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getPotongan() {
        return potongan;
    }

    public void setPotongan(int potongan) {
        this.potongan = potongan;
    }

    public Staff() {
    
    }

    // (Opsional jika ingin pakai konstruktor berparameter)
    public Staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void tampilDataStaff() {
        super.tampilDataKaryawan();
        System.out.println("Lembur        = " + lembur);
        System.out.println("Potongan      = " + potongan);
        System.out.println("Total Gaji    = " + (super.gaji + lembur - potongan));
    }
}