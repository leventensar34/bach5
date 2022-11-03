package days10;

public class Questions1 {

    public static void main(String[] args) {

        //// unary operators
        /// ++increses +1 -- decreses -1
        // create 2 variable third one after adding 2 variable assig it to 3. one

        int a = 10;
        int b = 20;
        int sum = ++a + ++b;
        System.out.println("sum = " + sum);

        sum = a-- + b--;
        System.out.println("sum = " + sum);
        sum = a + b;
        System.out.println("sum = " + sum);
        sum = --a + --b;
        System.out.println("sum = " + sum);

        double d = 2.9;
        d++;
        System.out.println("d = " + d);

        ///////////// task : sayilari degistirme, sadece 2 degiskene bagli islem yap

        int k = 10;
        int l = 20;

        k = k + l;
        l = k - l;
        k = k - l;
        System.out.println("k = " + k);
        System.out.println("l = " + l);


    }


}
