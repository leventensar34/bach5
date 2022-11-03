package days42;

public class WrapperClass {

    public static void main(String[] args) {

        Integer object = new Integer(1);

        Integer object2 = new Integer("1");

        int num1 = 5;
        Integer num2 = new Integer(5);
        Integer num3 = new Integer("5");

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // Wrappers objectlerin karsilastirilmasi
        System.out.println(num2.equals(num3)); // equqls() sadece objectin degerlerinin esit olup olmadigini kontrol eder.
        System.out.println(num2 == num3); // == objectlerin referanslarinin esit olup olmadigini kontrol eder.

        System.out.println("------------------");

        double d1 = 25.5;
        Double d2 = new Double(25.5);
        Double d3 = new Double("25.5"); // String olmasina ragmen hafizada bunu sayi olarak degistirip bize doner.

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println(d1 + d2 + d3);

        double d4 = d1 + d2 + d3;
        System.out.println(d4);
        System.out.println("----------------");

        char ch1 = 'c';
        Character ch2 = new Character('c');
        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("----------------");

        byte b1=12;
        Byte b2=new Byte((byte) 12);
        Byte b3=new Byte("12");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("----------------");
        short s1=1200;
        Short s2=new Short((short) 1200);
        Short s3=new Short( "1200");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);






    }
}
