package days49;

import java.util.ArrayList;

public class Metodlar4 {

    public static void main(String[] args) {


        ArrayList<Integer> numaralar = new ArrayList<>();
        numaralar.add(3);
        numaralar.add(13);
        numaralar.add(23);
        numaralar.add(3);
        numaralar.add(25);
        System.out.println("numaralar = " + numaralar);

        System.out.println("numaralar.indexOf(3) = " + numaralar.indexOf(3));
        System.out.println("numaralar.lastIndexOf(3) = " + numaralar.lastIndexOf(3));
        System.out.println("numaralar.indexOf(200) = " + numaralar.indexOf(200));

        for (Integer i : numaralar) {

            System.out.println("i= "+i);
        }
        System.out.println("------------------");
        for (int i = 0; i < numaralar.size() ; i++) {

            System.out.println("numaralar.get(i) = " + numaralar.get(i));
        }

    }
}
