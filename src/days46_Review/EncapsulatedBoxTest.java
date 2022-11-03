package days46_Review;

public class EncapsulatedBoxTest {

    public static void main(String[] args) {

        EncapsulatedBox kutu1 = new EncapsulatedBox();

        EncapsulatedBox kutu2=new EncapsulatedBox(15,10,5);

        kutu1.degerataEn(15);
        System.out.println("kutu1.degerOku() = " + kutu1.degerOku());

        System.out.println("kutu1.getHacim() = " + kutu1.getHacim());

        System.out.println("kutu2.getHacim() = " + kutu2.getHacim());

    }
}
