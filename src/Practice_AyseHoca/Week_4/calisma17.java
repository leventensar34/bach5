package Practice_AyseHoca.Week_4;

import java.util.ArrayList;
import java.util.Collections;

public class calisma17 {

    public static void main(String args[]){

        //  ArrayList atayalim
        ArrayList<String> list = new ArrayList<>();

        //  ArrayList in elemanlarini atayalim
        list.add("Gelin");
        list.add("Nazli");
        list.add("NazliGelin");
        list.add("GelinNazliGelin");
        list.add("Bir dugunde bulussunlar");

        System.out.println("Unsorted ArrayList: "
                + list);
        System.out.println("-------------------");

        // Sorting ArrayList in descending Order
        //  Collection.sort() method kullanin
        // sonra Collections.reverseOrder() ile duzenle
        Collections.sort(list, Collections.reverseOrder());

        //  The sorted ArrayList yazdir
        System.out.println("Sorted ArrayList "
                + "in Descending order : "
                + list);
    }
}
