package days40;

public class Arrays1 {

    public static void main(String[] args) {


        String[] arabalar=new String[5];
        arabalar[4]="honda";
        arabalar[0]="mazda";
        arabalar[1]="fiat";
        arabalar[2]="bmw";
        arabalar[3]="ferrari";

        System.out.println(arabalar[3]);

        for (String araba : arabalar) {
            System.out.println("araba = " + araba);

        }

        int[] numaralar={1,2,34,25,150};

        int say=0;
        for (int numara : numaralar) {
            System.out.println("numara = " + numara);

            say++;
            System.out.println(say);
        }





    }
}
