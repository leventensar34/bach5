package days67_Collection3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopWithIterator {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        numbers.add(30);
        numbers.add(50);
        numbers.add(100);
        numbers.add(150);
        numbers.add(60);
        numbers.add(70);
        numbers.add(70);

        System.out.println("numbers.size() = " + numbers.size());
        System.out.println(numbers);
        System.out.println("---------------------");

        for (Integer nums : numbers) {
            System.out.print(nums + "|");
        }

        System.out.println();
        System.out.println("----------------");

        // Iterator kullanmak icin once bir object olusturmak lazim
        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }

//        System.out.println(it.hasNext());
//        System.out.println(it.next());

        System.out.println("-----------------------");
        Iterator<Integer> it3 = numbers.iterator();

        while (it3.hasNext()) {
            int value = it3.next();
            if (value > 100) {
                it3.remove();
            }
        }
        System.out.println(numbers + "|");

        /*
        //Not: Foreach metodunda gelen elemani object olarak görmedigi icin remove metodu burada calismiyor.
        // remove metodu Iterator sinifindan geldigi icin gormuyor.Foreach yetersiz kaldigi icin iterator metodu kullanilir
        for (Integer nums : numbers) {
            if (nums>60){
                numbers.remove(nums);

            }
        }
        System.out.println(numbers);

         */


    }
}
