package days40_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

    public static void main(String[] args) {


        /*
        1-Arraylist sinirli degil , fakat Array sinirlidir
        2-ArrayList sadece object leri alir, fakat Array primitive leride alir.
        3-ArraysList uzunlugu size(); metodu ile, fakat Array uzunlugu lenght(); metodu kullanilir
         */
        // Creating an ArrayList

        ArrayList<String> names=new ArrayList<>();

        ArrayList<Integer> numbers=new ArrayList<>();

        //Assing values to ArrayList

        names.add("Ahmet");
        names.add("Ayse");
        names.add("Hasan");
        names.add("Emine");

        numbers.add(99);
        numbers.add(23);
        numbers.add(45);
        numbers.add(67);
       // numbers.add("123");
        numbers.add(new Integer("123"));

        //Reading values from ArrayList
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        System.out.println(numbers.get(4));

        System.out.println("names.size() = " + names.size());
        System.out.println("numbers.size() = " + numbers.size());

        System.out.println(names.toString());
        System.out.println(numbers.toString());

        String str=numbers.toString();
        String str2=names.toString();

        /// sort(); methodu listeyi kucukten buyuge  siralar

        Collections.sort(numbers);
        System.out.println(numbers.toString());


    }
}
