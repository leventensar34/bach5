package Days13_NestedIf;

public class IfElseIfTasks {
    public static void main(String[] args) {

        //// task 1: 0- 100 puan arasinda aldigi puana gore bu puana karsilik gelen not derecelendirme programi yaziniz

        int score = 88;

        if (score > 100) {
            System.out.println("Hatali bir deger girdiniz");
        }
        if (score >= 90) {
            System.out.println("Puan: A");
        } else if (score >= 81) {
            System.out.println("Puan: B");
        } else if (score >= 69) {
            System.out.println("Puan:C");
        } else if (score >= 41) {
            System.out.println("Puan: D");
        } else if (score >= 0) {
            System.out.println("Puan: F");
        } else {
            System.out.println("Negatif  bir deger girdiniz");
        }

        System.out.println("---------------------");
        /////// task 2:
        // Girilen üç sayıdan en büyük olanını bulan ve
        // ekrana yazdıran programı "if" yapısı kullanarak yazın.

        int sayi1, sayi2, sayi3;

        sayi1 = 24;
        sayi2 = 13;
        sayi3 = 67;

        if (sayi1 > sayi2 && sayi2 > sayi3) {
            if (sayi2 > sayi3) {
                System.out.println("sayi1>sayi2>sayi3");
            } else {
                System.out.println("sayi1>sayi3>sayi2");
            }
        } else if (sayi2 > sayi1 && sayi1 > sayi3) {
            if (sayi1 > sayi3) {
                System.out.println("sayi2>sayi1>sayi3");
            } else {
                System.out.println("sayi2>sayi3>sayi1");
            }
        } else {
            if (sayi1 > sayi2) {
                System.out.println("sayi3>sayi1>sayi2");
            } else {
                System.out.println("sayi3>sayi2>sayi1");
            }
        }

        ///////// task 3:
        //     Not: 1- dogru ve guvenilir bir kod icin sinirlar belli olmali ve mumkun mertebe degerlerin cakismamasi
        //     icin buyuk nottan baslayarak siniflandirilma yapilirsa daha iyi olur. Task 1 de oldugu gibi..

//        System.out.println("Aşağıdaki kod parçasındaki hata nedir?");
//        int score = 0;
//        score= 50;
//        if (score >= 60) {
//            System.out.println("D");
//        } else if (score >= 70){
//            System.out.println("C");
//        } else if (score >= 80) {
//            System.out.println("B");
//        } else if (score >= 90) {
//            System.out.println("A");
//        } else {
//            System.out.println("F");
//        }


    }
}