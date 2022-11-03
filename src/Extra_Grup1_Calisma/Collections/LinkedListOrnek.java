package Extra_Grup1_Calisma.Collections;

import java.util.LinkedList;

public class LinkedListOrnek {

    public static void main(String[] args) {

        LinkedList<Integer> ll=new LinkedList<>();

        for (int i = 10; i <=20; i++) {
         ll.add(i);

        }

        ll.remove(4);
        ll.remove(8);

        for (Integer s : ll) {
            System.out.print(s+" ");
        }
    }
}
