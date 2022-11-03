package days51;

import java.util.ArrayList;
import java.util.Arrays;

public class Review_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numaralar=new ArrayList<>();

        numaralar.add(10);
        numaralar.add(20);
        numaralar.add(2,30);
        System.out.println("numaralar = " + numaralar);

        System.out.println("numaralar.get(0) = " + numaralar.get(0));
        numaralar.add(0,50);
        System.out.println("numaralar.get(0) = " + numaralar.get(0));
        numaralar.set(0,200);
        System.out.println("numaralar = " + numaralar);
        numaralar.set(0,300);
        System.out.println("numaralar = " + numaralar);

        System.out.println("numaralar.size() = " + numaralar.size());

        numaralar.add(400);
        System.out.println("numaralar.size() = " + numaralar.size());
        System.out.println("numaralar = " + numaralar);
        System.out.println("numaralar.get(4) = " + numaralar.get(4));
        System.out.println("numaralar.get(numaralar.size()-1) = " + numaralar.get(numaralar.size() - 1));
        numaralar.add(600);
        System.out.println("numaralar.get(numaralar.size()-1) = " + numaralar.get(numaralar.size() - 1));



    }
}
