package Extra_Grup1_Calisma.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example {

    public static void main(String[] args) {

        Map<Integer, Character> m = new HashMap<>();
        for (int i = 65; i <= 90; i++) {
            m.put(i, (char) i);
        }

        Set<Integer> ks = m.keySet();

        Iterator<Integer> i= ks.iterator();

        while (i.hasNext()){
            Integer key=i.next();
            System.out.print(key+" ");
            System.out.println(m.get(key));
        }

    }
}
