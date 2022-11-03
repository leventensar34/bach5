package days29;

public class ReviewMethod3 {

    public static void main(String[] args) {

        System.out.println(pozitifToplama(2, 3));
        System.out.println(pozitifToplama(56, 98));
        int sum = pozitifToplama(45, 23);
        System.out.println(sum);

        System.out.println("--------------");

        System.out.println (fullNameYazici("Ahmet","Dalkilic"));

        System.out.println(fullNameYazici("Sare","Levent"));

        System.out.println(fullNameYazici("Ali","Levent"));



    }

    public static int pozitifToplama(int sayi1, int sayi2) {

        int total;
        total = sayi1 + sayi2;
        return total;

        // System.out.println(" bunu yazar mi?");

    }

    public static String fullNameYazici(String isim,String soyisim){

        String fullName=isim+" "+soyisim;

        return fullName;

    }







}
