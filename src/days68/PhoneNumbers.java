package days68;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumbers {

    public static void main(String[] args) {

        Map<String, Integer> telefonNumaralari = new HashMap<>();
        telefonNumaralari.put("Ali", 123456); //put() metodu ile eleman eklemesi yapilir
        telefonNumaralari.put("Veli", 455678);
        telefonNumaralari.put("Ayse", 987654);
        telefonNumaralari.put("Fatma", 987654);

        System.out.println("telefonNumaralari.get(\"Ali\") = " + telefonNumaralari.get("Ali"));
        System.out.println("telefonNumaralari.keySet() = " + telefonNumaralari.keySet());
        System.out.println("telefonNumaralari.values() = " + telefonNumaralari.values());

        for (Map.Entry<String, Integer> entry : telefonNumaralari.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
        System.out.println("----------------------");

        for (String str : telefonNumaralari.keySet()) {
            System.out.println(str);
        }

        for (Integer value : telefonNumaralari.values()) {
            System.out.println(value);
        }

        System.out.println("telefonNumaralari = " + telefonNumaralari);

        System.out.println("----------------------------");

        telefonNumaralari.forEach((x, y) -> System.out.println(x + " " + y)); //Lamda foreach
    }
}
