package Replit;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {


        // DO NOT CHANGE:
        Scanner s = new Scanner(System.in);
        String choice = s.next();

        //your code here
        if (choice.equals("coke") || choice.equals("coffie")||choice.equals("juice")  ) {
            System.out.println(choice+" = 4.0 $");
        }else if(choice.equals("soda")){
            System.out.println("\"soda\" = 2.0 $");
        }else{
            System.out.println("No choice");
        }


    }
}
