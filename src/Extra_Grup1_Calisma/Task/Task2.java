package Extra_Grup1_Calisma.Task;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {


        // Task 2:
//
//  Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
//
//        lastTwo("coding") → "codign"
//        lastTwo("cat") → "cta"
//        lastTwo("ab") → "ba"

        System.out.println(lastTwo());


    }

    public static String lastTwo() {
        String newstr2 = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String word: ");
        String word = scan.nextLine();
        for (int i = 0; i < word.length()-2; i++) {
            newstr2 += word.charAt(i);

        }
        char harf1= word.charAt(word.length()-1);
        char harf2=word.charAt(word.length()-2);
        newstr2=newstr2+harf1+harf2;

        return newstr2;
    }

}
