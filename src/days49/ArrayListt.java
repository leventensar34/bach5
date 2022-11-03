package days49;

import java.util.ArrayList;

public class ArrayListt {

    public static void main(String[] args) {


        String[] sehirler = {"ankara", "izmir", "hakkari", "erzincan"};
        System.out.println("sehirler.length = " + sehirler.length);

        int[] rakamlar = new int[3];


        ArrayList<Integer> numaralar = new ArrayList<>(); //Arraylist olustururken sag tarafinda icerde data tip yazilmayabilir.

        ArrayList<String> iller = new ArrayList<>();

        iller.add("Antalya"); //index 0
        iller.add("Adana"); //index 1
        iller.add("Tunceli"); //index 2
        iller.add(3,"Balikesir");
        iller.add(0,"Artvin");
        System.out.println("iller = " + iller);
        iller.set(0,"Ankara");  //set(); metotu ilgili indeksin uzerine yazdirir.eski indexi siler yerine yazdirir.

        System.out.println(iller);




    }
}
