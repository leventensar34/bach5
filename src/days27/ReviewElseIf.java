package days27;

public class ReviewElseIf {

    public static void main(String[] args) {

    /*    int a = 10;
        if (a < 10) {
            a++;
        } else if (a > 10) {
            --a;
        } else {
            a++;
        }
        System.out.println(++a); */


        System.out.println("-------------------");

        //////////// task : 3 int variable var bir tanesi 20 ve 12 arasinda ise true degilse false

        int a = 20, b = 15, c = 42;
        if ((a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20)) {
            System.out.println(" Sayilardan en az bir tanesi 12 ile 20 arasindadir ");
        } else {
            System.out.println(" Herhangi bir sayi 12 ile 20 arasinda degildir ");
        }

        System.out.println("---------------");

        //// task: iki int variable var . sayilardan bir tanesi 12 ile 20 arasinda ise true,iki tanesi
        // 12-20 arasinda ise false, bir tanesi bile 12-20 arasinda degilse false


        int x = 21;
        int y = 16;
        if ((x > 12 && x < 20) && (y > 12 && y < 20)) {
            System.out.println(false);
        } else if ((x > 12 && x < 20) || (y > 12 && y < 20)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
