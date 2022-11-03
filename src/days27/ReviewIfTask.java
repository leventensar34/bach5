package days27;

public class ReviewIfTask {

    public static void main(String[] args) {

        // pozitif 3 5 ve 8 kalansiz olarak bolunup bolunmedigini kontrol edin
        int num = 23;

        if (num % 3 == 0) {
            System.out.println(" sayi 3 e tam bolunur");
        } else if (num % 5 == 0) {
            System.out.println("sayi 5 e tam bolunur ");
        } else if (num % 8 == 0) {
            System.out.println("sayi 8 e tam bolunur");
        } else {
            System.out.println(" sayi bu verilen sayilarin hic birine tam bolunmuyor");
        }



    }
}
