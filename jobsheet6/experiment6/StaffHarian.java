package jobsheet6.experiment6;

public class StaffHarian extends Staff {
    
    public int iniJamKerja;

    public StaffHarian() {
    }

    public StaffHarian(String nama, String alamat, String jk, 
        int umur, int gaji, int lembur, int potongan, int iniJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.iniJamKerja = iniJamKerja;
    }

    public void tampilDataStaffHarian() {
        System.out.println("==============DATA STAFF HARIAN==================");
        super.tampilDataStaff();
        System.out.println("Jam Kerja     = " + iniJamKerja);
        System.out.println("Gaji Bersih    = " + (gaji * iniJamKerja + lembur - potongan));
    }
}
