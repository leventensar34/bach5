package days27;

public class ReviewOrnek {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        boolean deger=(a>b)&&(c<d);
        // short casting

        boolean veya=(a>b)||(c<d);

        System.out.println("deger = " + deger);
        System.out.println("veya = " + veya);

        boolean sonuc=!(a>b);
        System.out.println("sonuc = " + sonuc);


    }
}
