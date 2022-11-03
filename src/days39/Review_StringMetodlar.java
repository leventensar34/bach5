package days39;

public class Review_StringMetodlar {

    public static void main(String[] args) {

        String kelime = "Thl Ozl";  //Eleman sayisi: 7
        // 0123456
        // Son karakter in indexi nedir?   cevap: lenght-1

        System.out.println("kelime.length() = " + kelime.length());


        System.out.println("--------------------");

        char sonKarakter = kelime.charAt(6);
        System.out.println("sonKarakter = " + sonKarakter);


        System.out.println("--------------");

        String name = "Joe ";
        String surname = "Test";

        System.out.println(name.concat(surname));

        System.out.println("-------------");

        // Stringler immutable dir, yani degistirilemezler.Yeni bir deger atadigimmizda bunu pool da yeni bir obje olarak
        // kaydeder. Ilk string degeri poolda aynen eski obje olarak kalir ve degistirilemez.Dha sonra Java bu eski
        // objeyi Garbage atar.


        String paragraf1 = "Sana dun bir tepeden baktim Aziz Java";

        System.out.println("paragraf1.contains(\"Java\") = " + paragraf1.contains("Java"));

        System.out.println("-----------------");

        System.out.println("paragraf1.indexOf(97) = " + paragraf1.indexOf(97));

        System.out.println("paragraf1.indexOf(\"dun\") = " + paragraf1.indexOf("dun"));

        System.out.println("paragraf1.indexOf('a') = " + paragraf1.indexOf('a'));

        System.out.println("paragraf1.indexOf(\"S\",paragraf1.indexOf(\"S\")+1) = " + paragraf1.indexOf("S", paragraf1.indexOf("S") + 1));

        System.out.println("---------");

        String degistir = "Test yap Test";

        degistir = degistir.replace("Test", "Testler");
        System.out.println("degistir = " + degistir);

        System.out.println("---------------");

        ///// equals()  Stringlerde esitligi kontrol eder. Sadece degerlerini kontrol eder. Hfizadaki yerini degil.
        // Hfiza daki yerini == ile kiyaslariz

        System.out.println("-----------");

        // substring

        String dogrula = "500 kisi bunu begendi.Arkadaslarin arasinda ilk sen ol.";

                int baslangicIndex=0;
        int bitisIndex = dogrula.indexOf('k') - 1;
        String kisiSayisi=dogrula.substring(baslangicIndex,bitisIndex);

        System.out.println("kisiSayisi = " + kisiSayisi);

        System.out.println("-------------------");

     // split() metodu verilen bir stringi parcalara ayirmaya yarar!!!!

        String fullName="Ali Veli Deli BAGRIYANIK";

        String[] isimler=fullName.split(" ");
        //{"Ali","Veli","Deli","BAGRIYANIK"}




    }
}
