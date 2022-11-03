package days27;

public class ReviewTask1 {
    public static void main(String[] args) {

        //Negativ olmayan  iki int  degisken de ayni son rakama sahip ise true yazdirin



        System.out.println(sonRakam(13,33));
        System.out.println(sonRakam(22,87));
        System.out.println(sonRakam(0,100));
    }

    public static boolean sonRakam(int a,int b) {

        if (a% 10 == b % 10 ) {
           return  true;
        } else {
           return  false;
        }


    }

}
