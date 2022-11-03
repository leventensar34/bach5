package days67_Collection3;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(50);
        mySet.add(100);
        mySet.add(100);
        mySet.add(100);

        System.out.println("mySet = " + mySet);

        System.out.println(mySet.size());

        System.out.println("-------------------------");
        List<String> list= Arrays.asList("15","15","a","c","tt","c","r");
        System.out.println("list = " + list);

        Set<String> myset2=new HashSet<>(list);
        System.out.println("myset2 = " + myset2);

        System.out.println("------------------------");
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(500);
        treeSet.add(100);
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(7000);
        treeSet.add(100);

        System.out.println("treeSet = " + treeSet);

        System.out.println("treeSet.add(10) = " + treeSet.add(10));
        System.out.println("treeSet = " + treeSet);

        System.out.println("treeSet.add(120) = " + treeSet.add(120));
        System.out.println("treeSet = " + treeSet);


    }

}
