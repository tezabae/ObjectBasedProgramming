package jobsheet11;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill); // Membayar tagihan listrik
        
        System.out.println("---------------------------------");
        
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp); // Membayar gaji pegawai tetap
        
        System.out.println("---------------------------------");
        
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp); // Menampilkan info pegawai tetap
        
        System.out.println("---------------------------------");
        
        ow.showMyEmployee(iEmp); // Menampilkan info pegawai magang
        
        // Catatan: Jika perintah ow.pay(iEmp); ditambahkan di sini, 
        // akan terjadi error saat compile karena InternshipEmployee tidak mengimplementasikan Payable.
    }
}
