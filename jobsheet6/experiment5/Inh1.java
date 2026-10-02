package jobsheet6.experiment5;

public class Inh1 {
    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama = "Zhao Yufan";
        M.alamat = "Jl. Suhat No. 23";
        M.umur = 21;
        M.jk = "Laki-laki";
        M.gaji = 8000000;
        M.tunjangan = 4500000;
        M.tampilDataManager();

        System.out.println();

        Staff s = new Staff();
        s.nama = "Edwards Martin";
        s.alamat = "Jl. Lowokwaru No. 25";
        s.umur = 19;
        s.jk = "Laki-laki";
        s.gaji = 5000000;
        s.lembur = 250000;
        s.potongan = 250000;
        s.tampilDataStaff();
    }
}
