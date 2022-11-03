package days66_Collection2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> que=new LinkedList<>();
        que.add("Cemil");
        que.add("Ahmet");
        que.add("Mehmet");
        que.add("Beyza");

        System.out.println("que = " + que);

        // remove(); motodu ilk elementi listeden cikarir. FIFO--> ilk giren ilk cikar...
        String name= que.remove();
        System.out.println("name = " + name);

        System.out.println("que = " + que);

        name=que.poll(); //  poll(); metodu ilk elementi listeden cikarir.
        System.out.println("name = " + name);

        // peek(); motodu ile listenin basindaki elemeani ogreniriz
        name=que.peek();
        System.out.println("name = " + name);

        System.out.println("-------------------");
        que.poll();
        que.poll();
        que.poll();
        que.poll();
        System.out.println(que.poll());
        System.out.println("que = " + que);

      //  que.remove();
        // Not- (iki metod arasindaki fark):  Remove metodu eger list bos ise exception verir. Fakat poll metodu null yazdirir.

        System.out.println("lakjdhdbdgdt");

        try {
            que.remove();
        }catch (Exception e){
            System.out.println("kgifufhdjdz");
        }
    }
}
