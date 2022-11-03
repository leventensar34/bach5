package days51;

import java.util.ArrayList;

public class Review_ArrayList3 {

    public static void main(String[] args) {


        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Izmir");
        sehirler.add("Hamburg");
        sehirler.add("berlin");
        sehirler.add("Oslo");
        sehirler.add("munih");
        sehirler.add("atina");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("london");
        cities.add("Bremen");
        cities.add("Hakkari");
        System.out.println("cities.equals(sehirler) = " + cities.equals(sehirler));

        ArrayList<String> iller = new ArrayList<>();
        iller.add("london");
        iller.add("Bremen");
        iller.add("Hakkari");
        System.out.println("iller.equals(cities) = " + iller.equals(cities));

        ArrayList<String> expected = new ArrayList<>();
        expected.add("london");
        expected.add("Bremen");
        expected.add("Hakkari");
        System.out.println("expected.equals(iller) = " + expected.equals(iller));


    }
}
