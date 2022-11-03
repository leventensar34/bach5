package days28;

public class ReviewWhile {

    public static void main(String[] args) {

        /// 1 den 10 kadar olan sayilari toplami

        int a=1;
        int toplam=0;
        while (a<=10){
            toplam+=a;
            a++;
        }
        System.out.println(toplam);

    }
}
