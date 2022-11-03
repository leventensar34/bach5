package days58_Review;

public class Mutfak {

    String tarz;
    double m2;
    boolean dolap;
    int zemin;

    public Mutfak(double m2, boolean dolap, int zemin) {
        this.m2 = m2;
        this.dolap = dolap;
        this.zemin = zemin;
    }

    public String getTarz() {
        return tarz;
    }

    public double getM2() {
        return m2;
    }

    public boolean isDolap() {
        return dolap;
    }

    public int getZemin() {
        return zemin;
    }
}
