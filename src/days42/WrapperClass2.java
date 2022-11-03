package days42;

public class WrapperClass2 {

    public static void main(String[] args) {


        Integer object = Integer.valueOf(1);

        Integer object2 = Integer.valueOf("1");

        int num1 = 5;
        Integer num2 = Integer.valueOf(5);
        Integer num3 = Integer.valueOf("5");

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // Wrappers objectlerin karsilastirilmasi
        System.out.println(num2.equals(num3)); // equqls() sadece objectin degerlerinin esit olu olmadigini kontrol eder.
        System.out.println(num2 == num3); // == objectlerin referanslarinin esit olup olmadigini kontrol eder.

        System.out.println("------------------");

        double d1 = 25.5;
        Double d2 = Double.valueOf(25.5);
        Double d3 = Double.valueOf("25.5"); // String olmasina ragmen hafizada bunu sayi olarak degistirip bize doner.

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println(d1 + d2 + d3);

        double d4 = d1 + d2 + d3;
        System.out.println(d4);
        System.out.println("----------------");

        char ch1 = 'c';
        Character ch2 =Character.valueOf('c');
        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("----------------");

        byte b1=12;
        Byte b2=Byte.valueOf((byte) 12);
        Byte b3=Byte.valueOf("12");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("----------------");
        short s1=1200;
        Short s2= Short.valueOf((short) 1200);
        Short s3=Short.valueOf( "1200");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);




    }

}
