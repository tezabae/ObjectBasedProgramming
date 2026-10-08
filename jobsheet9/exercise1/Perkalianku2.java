package jobsheet9.exercise1;

public class Perkalianku2 {
    void perkalian(int a, int b) {
        System.out.println( a * b);
    }

    void perkalian(double a, double b) {
        System.out.println( a * b );
    }
    public static void main(String[] args) {
        Perkalianku2 obj = new Perkalianku2();
        obj.perkalian(25, 43);
        obj.perkalian(34.56, 23.7);
    }
}
