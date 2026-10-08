package jobsheet9.exercise1;

public class Perkalianku {
    void perkalian(int a, int b) {
        System.out.println( a * b);
    }

    void perkalian(int a, int b, int c) {
        System.out.println( a * b * c);
    }

    public static void main(String[] args) {
        Perkalianku obj = new Perkalianku();
        obj.perkalian(25, 43);
        obj.perkalian(34, 23, 56);
    }
}
