package jobsheet9.tasks;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();

        System.out.println("Total Sudut (1 sudut): " + sgt.totalSudut(60));
        System.out.println("Total Sudut (2 sudut): " + sgt.totalSudut(60, 40));
        System.out.println("Keliling (3 sisi)    : " + sgt.keliling(3, 4, 5));
        System.out.println("Keliling (sisi C)    : " + sgt.keliling(3, 4));
    }
}
