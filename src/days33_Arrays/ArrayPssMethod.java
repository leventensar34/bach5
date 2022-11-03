package days33_Arrays;

import java.util.Scanner;

public class ArrayPssMethod {

    public static void main(String[] args) {

        System.out.println("Passing array to Method");

        String[] sepet = new String[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Sepete ekleyeceginiz urunleri giriniz...");

        for (int i = 0; i < sepet.length; i++) {
            System.out.println((i + 1) + ". urun: ");
            sepet[i] = sc.nextLine();
        }

        System.out.println("Foreach yontemiyle listelenen");
        int j=0;
        for (String urun : sepet) {
            j++;
            System.out.println("Sepetteki " + j + ". urun " + urun);
        }


       sepetList(sepet);  // method call....

    }

    public  static void sepetList(String[] liste) {
        for (int i = 0; i < liste.length; i++) {
            System.out.println("Sepetteki " + (i + 1) + ". urun " + liste[i]);
        }
    }

}
