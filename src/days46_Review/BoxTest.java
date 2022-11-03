package days46_Review;

import javax.sql.rowset.serial.SerialStruct;

public class BoxTest {

    public static void main(String[] args) {

        Box kutu1 = new Box();
        System.out.println("kutu1.boy = " + kutu1.boy);
        kutu1.boy = 10;
        kutu1.en = 5;
        kutu1.yukseklik = 3;

        System.out.println("kutu1.boy = " + kutu1.boy);
        System.out.println("kutu1.en = " + kutu1.en);
        System.out.println("kutu1.yukseklik = " + kutu1.yukseklik);

        System.out.println("---------------------------");
        // toString(); metodu ile yazdirma...
        System.out.println(kutu1.toString());

        System.out.println("--------------");
        // kendi toString metodunu kendimizde olusturabiliriz
        kutu1.displayInfo();

        System.out.println("-----------------------");

        Box kutu2 = new Box(15, 10, 5);

        kutu2.displayInfo();

        System.out.println("---------------");

        Box kutu3 = new Box();
        System.out.println(kutu3.toString());
        System.out.println("------------------");

        Box kutu4=new Box(kutu2);

        kutu2.displayInfo();
        kutu4.displayInfo();

//        kutu2=kutu4;
//        boolean esitMi=(kutu2==kutu4);
//        System.out.println(esitMi);
        System.out.println("-------------------");

        System.out.println("kutu1.yukseklik = " + kutu1.yukseklik);
        kutu1.addBox(kutu2);
        System.out.println("kutu1.yukseklik = " + kutu1.yukseklik);




    }
}
