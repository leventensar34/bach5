package Replit;

import java.util.Scanner;

public class PozitifNegatif {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number= scan.nextInt();


        if (number>0){
            System.out.println("pozitive");
        } else if (number<0) {
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }
    }
}
