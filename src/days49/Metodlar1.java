package days49;

import java.util.ArrayList;
import java.util.Arrays;

public class Metodlar1 {

    public static void main(String[] args) {

        ArrayList<String> futbolKuulupleri = new ArrayList<>();

        ArrayList<Integer> rakamlar = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 9, 10)); //Arrays.asList(); metodu ilede direk donusturebiliriz
        System.out.println(rakamlar);

        rakamlar.add(20);
        System.out.println(rakamlar);
        System.out.println("rakamlar.size() = " + rakamlar.size()); //ArrayList lerin uzunlugunu size(); metodu ile yapariz.

        futbolKuulupleri.add("Bayer Munich");
        futbolKuulupleri.add("Herta Berlin");
        futbolKuulupleri.add(2,"Sporting Lizbon");
        System.out.println("futbolKuulupleri = " + futbolKuulupleri);





    }
}
