package Days15_Ternary;

import java.util.Scanner;

public class Example {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = "";
        String surname = "";
        String birthYear="";
        System.out.println("Green Kart icin lutfen asagidaki bilgileri giriniz!!!");
        System.out.println("Lutfen isiminizi giriniz: ");
        name = scan.nextLine();
        System.out.println("Soyadinizi giriniz: ");
        surname = scan.nextLine();
        System.out.println("Lutfen dogum yilinizi  giriniz");
        birthYear = scan.nextLine();
        String result;
        if (name.equals("Ahmet") && surname.equals("Yilmaz") && birthYear.equals("1986")) {
            result = "Congrats " + name + " . You have been randomly " +
                    "selected for further processing in the Diversity Immigrant Visa Program for the fiscal year 2023. ";
        } else {
            result = "Hi " + name + " Based on the information provided , the ENTRY HAS NOT BEEN SELECTED for further " +
                    "processing for the Electronic Diversity Visa Program at this time. ";
        }
        System.out.println("result = " + result);

    }

}
