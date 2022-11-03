package days63_Collection_YusufHocaEk;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListremoveAll {

    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a","b","c","d","f"));
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a","b","c","d","e"));


        //remove all elements of second list

        //listOne.removeAll(listTwo);
        //System.out.println("listOne = " + listOne);

        listOne.retainAll(listTwo);
        System.out.println("listOne = " + listOne);
    }
}
