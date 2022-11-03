package days66_Collection2;

import java.util.ArrayDeque;

public class ArrayDequeueExample {

    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();

        arrayDeque.add(20);
        arrayDeque.add(10);
        arrayDeque.add(15);
        arrayDeque.add(5);
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println(arrayDeque.peekFirst());  // peek(); ve peekFirst(); ilk elemani secer
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println(arrayDeque.peekLast());  // peekLast(); ilk elemani secer
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println(arrayDeque.poll());
        System.out.println("arrayDeque = " + arrayDeque);

        arrayDeque.addFirst(30); // listeye ilk eleman olarak atar.
        System.out.println("arrayDeque = " + arrayDeque);

        arrayDeque.addLast(40); //Listeye son eleman olarak atar.
        System.out.println("arrayDeque = " + arrayDeque);

        arrayDeque.clear(); // clear(); listeyi bosaltir
        System.out.println("arrayDeque = " + arrayDeque);

    }
}
