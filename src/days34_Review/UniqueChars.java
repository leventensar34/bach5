package days34_Review;

public class UniqueChars {

    public static void main(String[] args) {
        String abc = "DDEECGDDEEEEFGGDCDDM";
        String sonuc = "";

        sonuc = uniqueFind(abc); //Method call

        System.out.println("Test edilen String = " + abc);
        System.out.println("Unique chars in test String --> " + sonuc);
        System.out.println(uniqueFind(sonuc));
    }

    public static String uniqueFind(String abc) {
        String result = ""; //Metodtan dönecek unique karakterlerin tutulacağı değişken
        int count = 0; //Bir karakterin birden fazla tekrar edip etmediğini test için tekrar sayısının tutulacağı değişken
        for (int i = 0; i < abc.length(); i++) {
            for (int j = 0; j < abc.length(); j++) { //(i). indeksli karakter abc String i içerisindeki karakterlerle tek tek karşılaştırılıyor.
                if (abc.charAt(i) == abc.charAt(j)) {
                    count++; //Kontrol edilen karakterin tekrar sayısı
                }
            }
            if (count == 1) { //Tekrar sayısı 1 ise bu karakter unique dir.
                result += abc.charAt(i); //Unique olan karakterleri result değişkenine eklkiyoruz.
            }
            count = 0; //(i) indeksli Karakter kontrolü tamamlandığı için sayacı yeni karakter sayısını tespit için 0'a eşitliyoruz.
        }

        return result;
    }
}
