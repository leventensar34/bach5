package days53_FinalKeyword_MethodHidding;

public class FinalVariables {

    public final int MAX_SPEED = 320;
    // public final  int MIN_CAPACITY; // 1- ayni satirda deger verilmelidir.
    // MIN_CAPACITY=1;

    // Not: Objek olusturuldugu icin bu uc durum gecerlidir(1,2,3)
    public final int MAX_VELOCITY;
    public final int MAX_WEIGHT;

    public static final int MAX_HEIGHT = 180;
    public static final int MAX_VALOUME;


        public FinalVariables() {
            MAX_VELOCITY = 500;
        }



    public FinalVariables(int num) {  // 2- Cons. icinde deger verilebilir
        MAX_VELOCITY = num;
    }

    {
        MAX_WEIGHT = 120;           // 3- Unit block icinde deger verilebilir. Object olusumuna bagli
    }

    static {
        MAX_VALOUME=25;    //stattik class duzeyinde
    }

    public static void main(String[] args) {

        final int MAX_CAPACITY = 1000;
        // MAX_CAPACITY=230;

        final double PI = 3.14;

        final int TCNO;
        TCNO = 1234123;

        FinalVariables obj=new FinalVariables();
        System.out.println("Max Speed = "+obj.MAX_SPEED );




    }
}
