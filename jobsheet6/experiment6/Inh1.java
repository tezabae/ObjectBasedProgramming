package jobsheet6.experiment6;

public class Inh1 {
    public static void main(String[] args) {
        StaffTetap ST= new StaffTetap("Ahn Keonho", "Malang", "Laki-laki", 18, 5000000, 350000, 100000, "2A", 100000);
        ST.tampilDataStaffTetap();

        StaffHarian SH = new StaffHarian("Eom Seonghyeon", "Malang", "Laki-laki", 18, 5000000, 350000, 500000, 100);
        SH.tampilDataStaffHarian();
    }
}
