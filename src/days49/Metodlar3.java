package days49;

import java.util.ArrayList;

public class Metodlar3 {

    public static void main(String[] args) {


        ArrayList<Integer> numaralar = new ArrayList<>();
        numaralar.add(3);
        numaralar.add(13);
        numaralar.add(23);
        numaralar.add(3);
        System.out.println("numaralar = " + numaralar);

        numaralar.add(0,50);
        System.out.println("numaralar = " + numaralar);
        numaralar.set(0,500);
        System.out.println("numaralar = " + numaralar);

        System.out.println("numaralar.size() = " + numaralar.size());
        System.out.println("numaralar.get(0) = " + numaralar.get(0));
        System.out.println("numaralar.get(numaralar.size()-1) = " + numaralar.get(numaralar.size() - 1));// son elementi getirir.
        System.out.println("numaralar.get(numaralar.size()-2) = " + numaralar.get(numaralar.size() - 2));
        numaralar.get(0);
        System.out.println("numaralar.get(0) = " + numaralar.get(0));
        numaralar.remove(0);
        System.out.println("numaralar.get(0) = " + numaralar.get(0));

        System.out.println("---------------");

        // clear(); metodu ArrayList in icini tamamen siler.
        numaralar.clear();
        System.out.println("numaralar = " + numaralar);


    }
}
