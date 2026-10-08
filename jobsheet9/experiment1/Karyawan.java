package jobsheet9.experiment1;

public class Karyawan {
    private String nama;
    private String nip;
    private String golongan;
    private double gaji; // Diubah ke double agar konsisten

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;

        // Blok switch adding into  method setGolongan
        switch (golongan.charAt(0)) {
            case '1': 
                this.gaji = 5000000;
                break;
            case '2': 
                this.gaji = 3000000;
                break;
            case '3': 
                this.gaji = 2000000;
                break;
            case '4': 
                this.gaji = 1000000;
                break;
            case '5': 
                this.gaji = 750000;
                break;
            default:
                this.gaji = 0;
                break;
        }
    }

    // Setter manual if want to set gaji directlyz
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getGolongan() {
        return golongan;
    }

    public double getGaji() {
        return gaji;
    }
}