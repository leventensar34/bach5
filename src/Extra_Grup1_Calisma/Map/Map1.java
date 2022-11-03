package Extra_Grup1_Calisma.Map;

import java.util.*;

public class Map1 {

    public static void main(String[] args) {

        /*
        Map, her değere farklı bir anahtar eşler. Anahtarlarda (key) duplikasyon olamaz. Değerlerde value()
    duplikasyon olabilir. Anahtar sayısı değer sayısından az olamaz, ama daha çok olabilir.

       1- HashMap,
       2- TreeMap,
       3- LinkedHashMap
        Not: HashMap gelisi guzel torba gibi siralar, siralama gozetmez.
             TreeMap alfabetik siraya gore siralar,
             LinkedMap compiler ekleme sirasina gore siralar.
             not:
         */
        // key   // value
        Map<String, Integer> telefonNo = new HashMap<>();
        telefonNo.put("Ali", 12345);
        telefonNo.put("Ayse", 345678);
        telefonNo.put("tarik", 675432);

        for (String s : telefonNo.keySet()) {
            System.out.println(s);
        }
        System.out.println("---------------------");
        for (Integer value : telefonNo.values()) {
            System.out.println(value);
        }
        System.out.println("--------Lamda yontemi----------------");

        telefonNo.forEach((x, y) -> System.out.println(x + "-" + y));

        System.out.println("----------Entry Foreach-----------------");
        for (Map.Entry<String, Integer> entry : telefonNo.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
        System.out.println("------------------------------");

        Map<String, String> baskentler = new TreeMap<>();
        baskentler.put("Turkiye", "Ankara");
        baskentler.put("Almanya", "Berlin");
        baskentler.put("ABD", "Washington");
        baskentler.put("Fransa", "Paris");

        System.out.println("--------Lamda--------");
        baskentler.forEach((x, y) -> System.out.println(x + "-" + y));

        System.out.println("--------foreach Entry------------");
        for (Map.Entry<String, String> entry : baskentler.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }

        System.out.println("baskentler.size() = " + baskentler.size());
        System.out.println("baskentler.get(\"Almanya\") = " + baskentler.get("Almanya"));
        System.out.println("baskentler.containsValue(\"Ankara\") = " + baskentler.containsValue("Ankara"));

      //  TreeMap treeMap = new TreeMap<>(baskentler);


        //////////// Generic////////////
        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Ali");
        isimler.add("Veli");
       // isimler.add(2);

        ArrayList adlar=new ArrayList<>();
        adlar.add("Ayse");
        adlar.add(500);

    }
}
