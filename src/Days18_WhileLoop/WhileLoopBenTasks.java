package Days18_WhileLoop;

public class WhileLoopBenTasks {
    public static void main(String[] args) {

        // task 1:

        int x = 100;
        while (x > 0) {
            x++;
        }
        System.out.println("x = " + x);

        // task 2: 1 den 100 e kadar 2 ye bolunen sayilarn toplami

        int sayi = 1;
        int sum = 0;
        while (sayi <= 100) {
            if (sayi % 2 == 0) {
                sum += sayi;
            }
            sayi++;
        }
        System.out.println("sum = " + sum);

        // task 3: Bir int ilk sayi 30 olsun. Bir dongu olusturun sayi 20 den buyuk oldugu surece Dongudeyim yazdirin
        int num = 30;
        while (num > 20) {
            num--;
            System.out.println(num+" In the Loop");

        }

    }
}
