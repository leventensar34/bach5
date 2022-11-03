package days38;

public class Arrays1 {

    public static void main(String[] args) {

        String araba = "Honda";
        String araba1 = "Toyota";
        String araba2 = "BMW";

        int numara;
        String araba3;


        String[] arabalar;  //declaration
        arabalar = new String[3]; // kac tane element barindiracagini da belirliyoruz
        // String[] arabalar=new String[3]; // tek satirdada yazilabilir

        // Arraylarda index numarasi 0 dan baslar
        arabalar[0]="Renault"; // ilk elementi atadim
        arabalar[1]="ferrari";// ikinci element
        arabalar[2]="peugot"; // ucuncu element


        int[] numaralar = new int[5];

        numaralar[4]=500;
        System.out.println(numaralar[4]);



    }
}
