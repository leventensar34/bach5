package days29;

public class ReviewMethod4 {


    public static void main(String[] args) {

        System.out.println(bolmeIslemi(75.0,15.0));



    }

    public static void sayiYazdir(int sayi1,int sayi2){

        if (sayi1==5 || sayi2==5){
            return; //// eger bu kodu compleire girerse ona derki bu metod ile olan isin bitmistir.

        }else {
            System.out.println(sayi1+sayi2);
            System.out.println(sayi1);
            System.out.println(sayi2);

        }


    }

public static double bolmeIslemi(double sayi1,double sayi2){

        if (sayi2==0){
            System.out.println("0 hicbir sayiyi bolemez");
            return 0;

        }
         return  sayi1/sayi2;
        }


}





