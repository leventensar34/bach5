package days51;

import java.util.ArrayList;

import java.util.Collections;

public class Review_ArrayList2 {

    public static void main(String[] args) {

        //  Integer[] rakamlar={1,2,3,4};
        //  ArrayList<Integer> numaralar=new ArrayList<>(Arrays.asList(rakamlar));
//
//        ArrayList<Integer> numaralar=new ArrayList<>(Arrays.asList(1,2,3,4,5)); //toptan atama yapabiliriz
//        System.out.println("numaralar = " + numaralar);
//        System.out.println("numaralar.get(0) = " + numaralar.get(0));

        ArrayList<Integer> numaralar = new ArrayList<>();
        numaralar.add(10);
        numaralar.add(20);
        numaralar.add(30);
        numaralar.add(5);
        numaralar.add(15);
        numaralar.add(25);
        System.out.println("numaralar = " + numaralar);
        System.out.println("numaralar.contains(20) = " + numaralar.contains(20));
        System.out.println("numaralar.contains(120) = " + numaralar.contains(120));
        Collections.reverse(numaralar);
        System.out.println("numaralar = " + numaralar);
        Collections.sort(numaralar);
        System.out.println("numaralar = " + numaralar);
        Collections.reverse(numaralar);
        System.out.println("numaralar = " + numaralar);

        System.out.println("--------------------");

        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Izmir");
        sehirler.add("Hamburg");
        sehirler.add("berlin");
        sehirler.add("Oslo");
        sehirler.add("munih");
        sehirler.add("atina");

        System.out.println("sehirler = " + sehirler);
        Collections.sort(sehirler);
        System.out.println(sehirler);
        Collections.sort(sehirler, String.CASE_INSENSITIVE_ORDER);
        System.out.println(sehirler);

    }
}
