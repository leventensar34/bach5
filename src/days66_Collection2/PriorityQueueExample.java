package days66_Collection2;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorty = new PriorityQueue();

//        int num=20;
//        priorty.add(num);
        priorty.add(20);
        priorty.add(15);
        priorty.add(9);
        priorty.add(6);
        priorty.add(5);

        System.out.println(priorty.peek()); // Dogal siralamaya gore siralar
        System.out.println("priorty = " + priorty);

        System.out.println("------------------");
        System.out.println(priorty.poll());
        System.out.println("priorty = " + priorty);

        System.out.println("--------------------");

        PriorityQueue<String> priority2=new PriorityQueue();

        priority2.add("Aaba");
        priority2.add("Zab");
        priority2.add("Baa");
        priority2.add("Aaab");

        System.out.println(priority2.peek());
        System.out.println("priority2 = " + priority2);

        System.out.println(priority2.poll());
        System.out.println("priority2 = " + priority2);

        System.out.println(priority2.poll());
        System.out.println("priority2 = " + priority2);

        // get(); metodu burada kullanilamiyor, cunku indexine gore siralamiyor.Kendine ozgu siralamasi var.

    }
}
