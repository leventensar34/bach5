package days63_Collection_YusufHocaEk;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Ankara");
        linkedList.add("Istanbul");
        linkedList.add("Konya");

        for (String eleman: linkedList) {
            System.out.println("Linked list elemanı ---> " + eleman);
        }
        System.out.println();
        linkedList.remove("İstanbul");

        for (String eleman: linkedList) {
            System.out.println("Linked list elemanı ---> " + eleman);
        }
        System.out.println();
        linkedList.addFirst("Mersin");
        for (String eleman: linkedList) {
            System.out.println("Linked list elemanı ---> " + eleman);
        }

        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
    }
}
