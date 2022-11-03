package days38;

public class ArraysPrint {

    public static void main(String[] args) {

        String[] futbolcular = new String[11];

        futbolcular[0]="Pele";
        futbolcular[1]="Henry";

        String[]kulupler={"Barselona","Chelsea","Real Madrid","Juventus","Roma"};

        String baskent="Ankara";
        System.out.println("baskent.length() = " + baskent.length());

        System.out.println("kulupler.length = " + kulupler.length);

        System.out.println("kulupler[4] = " + kulupler[4]);
        System.out.println("kulupler[kulupler.length-1] = " + kulupler[kulupler.length - 1]);


        System.out.println("kulupler[2] = " + kulupler[2]);
        System.out.println("kulupler[2].substring(0,5) = " + kulupler[2].substring(0, 5));

        ////////////

        int[] numaralar={10,20,30,40,50,60,70,80,90,100,110};

        System.out.println("numaralar[0] = " + numaralar[0]);

        System.out.println("numaralar.length = " + numaralar.length);
        System.out.println("numaralar[numaralar.length-1] = " + numaralar[numaralar.length - 1]);




    }
}
