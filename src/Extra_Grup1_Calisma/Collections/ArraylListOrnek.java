package Extra_Grup1_Calisma.Collections;

import java.util.ArrayList;

public class ArraylListOrnek {

    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();

       // al.add(1);

        for (int i = 0; i <=7; i++) {
           al.add(i);

            System.out.println(i);
        }
        al.remove(3);

        System.out.println("---------for loop----------------");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i)+" ");


            System.out.println("-------foreach-------");

            for (Integer s : al) {
                System.out.println(s);
            }

        }

    }
}
