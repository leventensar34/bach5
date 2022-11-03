package Extra_Grup1_Calisma.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOrnek {

    public static void main(String[] args) {

        TreeSet<String> trs=new TreeSet<>();


        trs.add("HashSet");
        trs.add("ornek");
        trs.add("java");
        trs.add("kod");
        trs.add("yufka");

        trs.remove("kod");
        Iterator<String> itr= trs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
