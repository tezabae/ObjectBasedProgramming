package jobsheet9.experiment1;

public class Manager extends Karyawan {
    private double tunjangan;
    private String bagian;
    private Staff[] st; // Array objek untuk menampung daftar bawahan (Staff)

    // Setter dan Getter untuk atribut tunjangan
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    // Setter dan Getter untuk atribut bagian
    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    // Setter untuk menetapkan daftar staff yang dibawahi
    public void setStaff(Staff[] st) {
        this.st = st;
    }

    // Method untuk menampilkan daftar staff bawahan
    public void viewStaff() {
        System.out.println("--------------------");
        if (st != null) {
            for (int i = 0; i < st.length; i++) {
                st[i].lihatInfo();
            }
        }
        System.out.println("--------------------");
    }

    // Method Override untuk menghitung total gaji Manager (Gaji Pokok + Tunjangan)
    @Override
    public double getGaji() {
        return super.getGaji() + tunjangan;
    }

    // Method untuk menampilkan informasi lengkap Manager
    public void lihatInfo() {
        System.out.println("Manager  :" + this.getBagian());
        System.out.println("NIP      :" + this.getNip());
        System.out.println("Nama     :" + this.getNama());
        System.out.println("Golongan :" + this.getGolongan());
        System.out.printf("Tunjangan:%.0f\n", this.getTunjangan());
        System.out.printf("Gaji     :%.0f\n", this.getGaji());
        System.out.println("Bagian   :" + this.getBagian());
        
        // Memanggil method viewStaff untuk menampilkan daftar bawahan
        this.viewStaff();
    }
}