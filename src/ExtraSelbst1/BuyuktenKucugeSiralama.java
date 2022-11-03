package ExtraSelbst1;

import java.util.Scanner;

public class BuyuktenKucugeSiralama {

    public static void main(String[] args) {
        /*
        1- a>b>c && a>c>b -->a
        2- b>a>c && b>c>a -->b
        3- c>a>b && c>b>a -->c
         */
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.println(" Lutfen sayilari Giriniz : ");
        a= scan.nextInt();
        b= scan.nextInt();
        c= scan.nextInt();
        if (a>b && b>c){
         if (b>c){
             System.out.println("a>b>c");
         }else{
             System.out.println("a>c>b");
         }
        }else if (b>a && a>c){
            if (a>c){
                System.out.println("b>a>c");
            }else{
                System.out.println("b>c>a");
            }
        }else{
            if (a>c){
                System.out.println("c>a>b");
            }else{
                System.out.println("c>b>a");
            }
        }

    }
}
