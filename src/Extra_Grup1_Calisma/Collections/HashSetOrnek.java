package Extra_Grup1_Calisma.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOrnek {

    public static void main(String[] args) {

        HashSet<String> hs=new HashSet<>();
        hs.add("HashSet");
        hs.add("ornek");
        hs.add("java");
        hs.add("kod");
        hs.add("yufka");

        Iterator<String> itr= hs.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }




    }
}
