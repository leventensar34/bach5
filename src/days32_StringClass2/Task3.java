package days32_StringClass2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println(uniqueChar());


    }

    public static String  uniqueChar(){

       String name= "DDEECGDDEEEEFGGDCDDM";

     String name2=name.substring(12);
     String name3=name2.replace("GGDCDD","");

     return name3;
    }
}
