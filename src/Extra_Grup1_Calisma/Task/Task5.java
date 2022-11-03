package Extra_Grup1_Calisma.Task;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {


        // Task 5:

//        Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b)
//        is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
//
//        nearTen(12) → true
//        nearTen(17) → false
//        nearTen(19) → true

        System.out.println(nearTen());
    }

    public static boolean nearTen() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int num = scan.nextInt();
        if (num % 10 == 1 || num % 10 == 2 || num % 10 == 9 || num % 10 == 8) {
            return true;
        } else {
            return false;
        }
    }


}
