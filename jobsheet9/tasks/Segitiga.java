package jobsheet9.tasks;

public class Segitiga {
    public int sudut;

    //Overloading method totalSudut dengan parameter 1

    public int totalSudut(int sudutA) {
        this.sudut = 180 - sudutA;
        return sudutA;
    }

    //Overloading method totalSudut dengan parameter 2
    public int totalSudut(int sudutA, int sudutB) {
        this.sudut = 180 - (sudutA + sudutB);
        return sudutB;
    }

    //Overloading method totalSudut dengan parameter 3
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    //Overloading method totalSudut dengan parameter 4
    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return c;
    }
}
