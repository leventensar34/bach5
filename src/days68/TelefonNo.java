package days68;

import java.util.*;

public class TelefonNo {

    public static void main(String[] args) {

        // Not: HashMap gelisi guzel torba gibi siralar- siralama gozetmez. TreeMap alfabetik siraya gore siralar,
        // LinkedMap compiler ekleme sirasina gore siralar
        Map<String, Integer> telefonNumaralari = new HashMap<>();
        TreeMap<String, Integer> no = new TreeMap<>();
        telefonNumaralari.put("Ali", 123456);  // Map interface inde put metodu eleman ekleme icin kullanilir
        telefonNumaralari.put("Veli", 456789);
        telefonNumaralari.put("Ayse", 987654);

        Map<String, String> memleketleri = new HashMap<>();
        memleketleri.put("Ali", "Izmir");
        memleketleri.put("Veli", "Istanbul");
        memleketleri.put("Ayse", "Trabzon");

        // get metodu eleman cagirmak icin kullanilir
        System.out.println("telefonNumaralari.get(\"Ayse\") = " + telefonNumaralari.get("Ayse"));
        System.out.println("memleketleri.get(\"Ali\") = " + memleketleri.get("Ali"));

        System.out.println("---------------------------");

        Map<String, String> baskentler = new LinkedHashMap<>();
        baskentler.put("Turkiye", "Ankara");
        baskentler.put("Norvec", "Oslo");
        baskentler.put("Portekiz", "Lizbon");
        baskentler.put("Ingiltere", "Londra");

        System.out.println("baskentler.get(\"Turkiye\").equals(\"Ankara\") = " + baskentler.get("Turkiye").equals("Ankara"));
        System.out.println("telefonNumaralari.size() = " + telefonNumaralari.size());
        System.out.println("memleketleri.size() = " + memleketleri.size());
        System.out.println("baskentler.size() = " + baskentler.size());

        System.out.println("telefonNumaralari.containsKey(\"Ali\") = " + telefonNumaralari.containsKey("Ali"));
        System.out.println("baskentler.containsKey(\"Turkiye\") = " + baskentler.containsKey("Turkiye"));
        boolean b = telefonNumaralari.containsValue(123456);
        System.out.println("b = " + b);
        System.out.println("baskentler.containsValue(\"Ankara\") = " + baskentler.containsValue("Ankara"));

        System.out.println("telefonNumaralari.keySet() = " + telefonNumaralari.keySet());
        System.out.println("memleketleri.keySet() = " + memleketleri.keySet());

        System.out.println("telefonNumaralari.values() = " + telefonNumaralari.values());

        Map<String, Integer> phoneNumbers = new HashMap<>();
        phoneNumbers.putAll(telefonNumaralari);
        System.out.println("phoneNumbers.size() = " + phoneNumbers.size());



    }
}
