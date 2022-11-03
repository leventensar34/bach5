package Days15_Ternary;

public class TernaryOperators2 {

    public static void main(String[] args) {

        int number = 24;
        if (number > 0) {
            System.out.println("Pozitif sayi");
        } else {
            System.out.println("Negatif sayi");
        }

        System.out.println("--------------");

        String result;
        result = (number > 0) ? "Pozitif sayi" : "Negatif sayi";
        System.out.println("result = " + result);

        System.out.println("------------------------");

        int score = 59;
        String result2;

        result2 = (score > 60) ? "You passed the exam" : "You failed thr exam";

        System.out.println("------------");

        int age = 18;
        String num = (age > 18) ? "user is eligible to vote" : " user is not eligible to vote";
        System.out.println("num = " + num);

        //////////////
        int sayi = 133;
        String sonuc;
        sonuc = (sayi % 2 == 0) ? "sayi is even" : "sayi is odd";
        System.out.println("sonuc = " + sonuc);

        /////////////


    }
}
