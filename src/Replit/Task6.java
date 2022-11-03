package Replit;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter month number : ");
        int monthNum =input.nextInt();


        //WRITE YOUR CODE HERE

        String month="";
        switch(monthNum){
            case 1:
                month="January";
                break;
            case 2:
                month="February";
                break;
            case 3:
                month="March";
                break;
            case 4:
                month="April";
                break;
            case 5:
                month="May";
                break;
            case 6:
                month="Juli";
                break;
            case 7:
                month="July";
                break;
            case 8:
                month="August";
                break;
            case 9:
                month="September";
                break;
            case 10:
                month="October";
                break;
            case 11:
                month="November";
                break;
            case 12:
                month="December";
                break;
            default:
                System.out.println("No such month");
        }
        System.out.println("month = " + month);
    }
}
