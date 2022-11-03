package days28;

public class ReviewDoWhile2 {

    public static void main(String[] args) {

        //// 0 dan 50 ye kadar olan cift sayilari yaziniz.Do while kullanarak
        int a=0;

        do {
            if (a%2==0){
                System.out.println(a+" cift sayidir");
            }else{
                System.out.println(a+" tek sayidir");
            }
            a++;
        }while (a<=50);

    }
}
