package days49;

import java.util.ArrayList;

public class ExampleKuluplerCozum2 {

    public static void main(String[] args) {


        ArrayList<String> futbolKuulupleri = new ArrayList<>();

        futbolKuulupleri.add("Bayer Munich");
        futbolKuulupleri.add("Herta Berlin");
        futbolKuulupleri.add(2, "Sporting Lizbon");
        futbolKuulupleri.add("Eintracht Frankfurt");
        futbolKuulupleri.add("Borussia Dortmund");
        futbolKuulupleri.add("Werder Bremen");

//        String s= futbolKuulupleri.get(0).split(" ")[1];
//        System.out.println(s);

        ArrayList<String> sehirler=new ArrayList<>();
        for (String kulup : futbolKuulupleri) {
            sehirler.add(kulup.split(" ")[1]);
        }
        System.out.println("sehirler = " + sehirler);


           //2. cozum FooLoop la
        System.out.println("---FoLoop---");


    }

}
