package jobsheet9.tasks;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan siang di kantin kampus");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur memeriksa tugas mahasiswa");
    }
}

