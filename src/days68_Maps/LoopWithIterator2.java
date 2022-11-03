package days68_Maps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopWithIterator2 {

    public static void main(String[] args) {


        Set<Integer> nums=new HashSet<>();

        nums.add(10);
        nums.add(30);
        nums.add(80);
        nums.add(50);
        nums.add(110);
        nums.add(170);
        nums.add(90);
        nums.add(1200);
        nums.add(1190);
        nums.add(20);
        nums.add(70);

        System.out.println("nums = " + nums);

        for (Integer num : nums) {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("------------------");
        Iterator<Integer> it=nums.iterator();

        while (it.hasNext()){
            int val=it.next();
            if (val>1000){
                it.remove();
            }
        }
        System.out.println("nums = " + nums);
        // not: foreach  remove metodu ile exception verir.

      //  it.forEachRemaining(i-> System.out.println(i+" "));
    }

}
