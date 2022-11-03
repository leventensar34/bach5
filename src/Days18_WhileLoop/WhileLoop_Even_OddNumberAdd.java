package Days18_WhileLoop;

public class WhileLoop_Even_OddNumberAdd {

    public static void main(String[] args) {

        System.out.println("0 ile 100 arasındaki çift sayıların toplamı...");

        int i = 0;
        int sumEven = 0;
        int sumTek = 0;

        while (i < 100){

            if(i%2==0) {
                sumEven = sumEven + i;
                System.out.println("cift sayılar...: " + i);
            }
            if(i%2!=0) {
                sumTek = sumTek + i;
                System.out.println("Tek sayılar...: " + i);
            }
            i++;
        }
        System.out.println("Tek Sayıların Toplamı...: " + sumTek);
        System.out.println("Çift Sayıların Toplamı...: " + sumEven);



    }
}
