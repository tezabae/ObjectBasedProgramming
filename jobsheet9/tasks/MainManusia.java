package jobsheet9.tasks;

public class MainManusia {
    public static void main(String[] args) {
        // Dynamic Method Dispatch: Referensi superclass menunjuk ke objek subclass
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();

        // Method bernafas dipanggil dari superclass (Manusia)
        m1.bernafas();
        
        // Method makan dipanggil sesuai objek aslinya saat runtime (Dosen)
        m1.makan(); 

        System.out.println("--------------------");

        m2.bernafas();
        
        // Method makan dipanggil sesuai objek aslinya saat runtime (Mahasiswa)
        m2.makan(); 
    }
}
