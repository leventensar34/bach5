package Days18_WhileLoop;

public class WhileLoop_Palindrom {
    public static void main(String[] args) {


        int tersSayi = 0;
        int orjinalSayi=12321;
        int sayi =orjinalSayi;
        while (sayi > 0) {

            tersSayi = tersSayi * 10 + sayi % 10;
            sayi = sayi / 10;
        }
        if (tersSayi==orjinalSayi){
            System.out.println("Bu sayi Palindrom bir sayidir");
        }else {
            System.out.println("Bu sayi Palindrom bir sayi degildir");
        }
        System.out.println("tersSayi = " + tersSayi);
    }
}
