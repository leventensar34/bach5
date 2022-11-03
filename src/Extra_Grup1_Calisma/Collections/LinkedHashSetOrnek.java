package Extra_Grup1_Calisma.Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetOrnek {

    public static void main(String[] args) {


        LinkedHashSet<String> lhs=new LinkedHashSet<>();

        lhs.add("HashSet");
        lhs.add("ornek");
        lhs.add("java");
        lhs.add("kod");
        lhs.add("yufka");

        Iterator<String>itr= lhs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
