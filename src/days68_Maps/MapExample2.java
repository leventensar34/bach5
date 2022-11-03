package days68_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

    public static void main(String[] args) {


        Map<String, Double> items = new HashMap<>();

        items.put("Apple", 5.3);
        items.put("Orange", 2.3);
        items.put("Banana", 6.8);
        items.put("Cherry", 7.5);

        System.out.println("items = " + items);

        items.put("Apple", 6.5); // dublicated yani eleman tekrari yapmiyor.Bunu yeni bir obje olarak görmuyor ama
        // valusunu degistiriyor.Key mutlaka olmasi lazim,key e gore gorur

        System.out.println("items = " + items);
        System.out.println("items.size() = " + items.size());

        items.remove("Apple");
        System.out.println("items = " + items);
        System.out.println("items.size() = " + items.size());

        System.out.println("items.containsKey(\"Apple\") = " + items.containsKey("Apple"));
        System.out.println("items.containsKey(\"Orange\") = " + items.containsKey("Orange"));

        System.out.println("items.containsValue(6.8) = " + items.containsValue(6.8));

        System.out.println(items.get("Cherry") + 5);

    }
}
