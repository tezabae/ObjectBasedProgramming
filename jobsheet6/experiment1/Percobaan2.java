package jobsheet6.experiment1;

public class Percobaan2 {
    public static void main(String[] args) {
        ClassB hitung = new ClassB();
        
        hitung.x = 20;
        hitung.y = 30;
        
        // Karena z private, aksesnya menggunakan setter
        hitung.setZ(5); 
        
        hitung.getNilai();
        hitung.getNilaiZ();
        hitung.getJumlah();
    }
}