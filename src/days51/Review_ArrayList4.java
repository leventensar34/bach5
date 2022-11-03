package days51;

import java.util.ArrayList;

public class Review_ArrayList4 {

    public static void main(String[] args) {


        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Izmir");
        sehirler.add("Hamburg");
        sehirler.add("berlin");
        sehirler.add("Oslo");
        sehirler.add("munih");
        sehirler.add("atina");

        // 1. yeni yontemle yazdirma
        sehirler.forEach(System.out::println);
        System.out.println("------------------");

        //2. yazdirma yontemi Foreach ile
        for (String sehir : sehirler) {
            System.out.println("sehir = " + sehir);
        }
        System.out.println("-----------------");
        for (int i = 0; i <sehirler.size() ; i++) {
            System.out.println("sehirler.get(i) = " + sehirler.get(i));
        }



    }
}
