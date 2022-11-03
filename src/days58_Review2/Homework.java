package days58_Review2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework {

    public static void main(String[] args) {

      /*
         Write a method that can sort Letters and Numbers from alphanumeric String

         Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
         sort the individual string and append them back together

      Ex: Input:  “DC501GCCCA098911"
        OutPut: “CD015ACCCG011899"
       */

        System.out.println(sorted( "DC501GCCCA098911"));


    }
    public static String sorted(String s) {

        char[] arr = s.toCharArray();
        String result = "";
        List<Character> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; ++i) {

            while(i < arr.length && Character.isLetter(arr[i])) {
                temp.add(arr[i++]);
            }

            Collections.sort(temp);

            for (Character c : temp) {
                result += c;
            }

            temp.clear();

            while(i < arr.length && Character.isDigit(arr[i])) {
                temp.add(arr[i++]);
            }

            Collections.sort(temp);

            for (Character c : temp) {
                result += c;
            }

            temp.clear();

        }

        return result;
    }
}
