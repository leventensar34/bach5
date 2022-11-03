package Practice_AyseHoca.Week_3;

import java.util.Scanner;

public class calisma13 {

    public static void main(String[] args) {
        /*
        ödev :   //scanner class ile rakamlardan oluşan bir string isteyin
        //string olarak girilen sayının içindeki çift rakanları sayının başına yazdıran kod yazın
        // String sayı="2345678"; // ===>2468357

         */

        System.out.println(alem());

    }

    public static int alem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String number: ");
        String input = scan.nextLine();
        String newStr1 = "";
        String newStr2 = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) % 2 == 0) {
                newStr1 = newStr1 + input.charAt(i);
            } else {
                newStr2 = newStr2 + input.charAt(i);
            }

        }
        String result=newStr1.concat(newStr2);
        int result1=Integer.parseInt(result);

        return result1;
    }
}
