package days33_Arrays;

public class DiziTemel {

    public static void main(String[] args) {
        System.out.println("Temel Dizi kavramları");
        //Dizilerin elemanları  0'dan başlayan indeks numaraları ile adlandırılırlar.
        //Yani bir dizinin 1.elemanı 0 indeksli elemanıdır.

        String[] arabalar = new String[4]; //4 elemanlı String veri tipinde bir dizi tanımlaması yapılmış
        int[] sayilar = {1,3,4,5,6}; // 5 elemanlı elemanlarının ilk değerleri girilmiş int tipinde bir dizi
        int[] sayilarDef = new int[4]; // 4 elemanlı int tipinde default değerler ile tanımlanmış bir dizi

        System.out.println("Sayılar dizisi..: " + sayilar[2]); // sayılar dizisinin 2. indeksindeki elemanı
        System.out.println("SayılarDef...: " + sayilarDef[3]);

        arabalar[0] = "Mazda"; //arabalar dizisinin 0 indeks numaralı elemanına "Mazda" verisi ataması yapılmış
        arabalar[3] = "Mercedes"; //arabalar dizisinin 3 indeks numaralı elemanına "Mercedes" verisi ataması yapılmış

        System.out.println("Arabalar Dizisinin 1. elemanı[0] : " + arabalar[0]); //arabalar dizisinin 0 indeksli elemanı ekrana yazdırılmış

        System.out.println("Sayılar dizisinin boyutu ..: " + sayilar.length); //sayilar dizisinin .length metodu ile boyutu yazdırılmış

        System.out.println("Sayılar dizisinin son elemanı : " + sayilar[(sayilar.length - 1)]);//dizinin son elemanı (.length-1) ekrana yadırılmış

    }
}
