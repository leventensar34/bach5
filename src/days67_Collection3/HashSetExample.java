package days67_Collection3;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {


        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Mavi");
        hashSet.add("Yesil");
        hashSet.add("Gri");
        hashSet.add("Yesil");
        hashSet.add("Beyaz");
        hashSet.add("Beyaz");

        // Tekrarlari tek eleman olarak yazar. Kume mantigi ile calisir.Siralamalari hafizasindaki hashCoduna gore hesapliyor
        System.out.println("hashSet = " + hashSet);

      //  Not: foreach in baska bir sekilde yazilmasi
     //   hashSet.forEach(item-> System.out.println(item+" "));

        for (String each : hashSet) {
            System.out.println(each.hashCode());
        }
    }
}
