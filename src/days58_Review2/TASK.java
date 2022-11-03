package days58_Review2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TASK {

    public static void main(String[] args) {

      /*
         Write a method that can sort Letters and Numbers from alphanumeric String

         Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
         sort the individual string and append them back together

      Ex: Input:  “DC501GCCCA098911"
        OutPut: “CD015ACCCG011899"
       */
        String str="DC501GCCCA098911";
        String str1,str2,str3,str4;
        str1=str.substring(0,2);

        str2=str.substring(2,5);
        str3=str.substring(5,10);
        str4=str.substring(10);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
        str=teile2(str1)+teile2(str2)+teile2(str3)+teile2(str4);
        System.out.println("str = " + str);

    }
    public static String teile2(String str){
        String newStr="";
        ArrayList <Character> harf=new ArrayList();
        for(int i=0; i< str.length();i++){
            harf.add(str.charAt(i));
        }
        Collections.sort(harf);
        for(int i=0;i<harf.size();i++){
            newStr=newStr+harf.get(i);
        }
        return newStr;
    }

    }




