package days37_WrapperClass;

import java.awt.geom.Arc2D;

public class Wrapper_Class2 {

    public static void main(String[] args) {


        Integer object = Integer.valueOf(1);

        Integer object2 = Integer.valueOf("1");

        System.out.println(object);
        System.out.println(object2);

        int num1 = 5;
        Integer num2 = Integer.valueOf(5);
        Integer num3 = Integer.valueOf("5");
        Integer num4 = Integer.valueOf(num1);


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        // Wrappers objectlerin karsilastirilmasi
        System.out.println(num2.equals(num3));
        System.out.println(num2 == num3);

        System.out.println("------------");

        float f1 = 25.5f;
        Float f2 = Float.valueOf(25.5f);
        Float f3 = Float.valueOf("25.5");
        Float f4 = Float.valueOf(f1);

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);

        System.out.println("------------");
        char c1 = 'c';
        Character c2 = Character.valueOf('c');
        // Character c3=new Character("c");

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        System.out.println("------------");
        byte b1 = 12;
        Byte b2 = Byte.valueOf((byte) 12);
        Byte b3 = Byte.valueOf("12");
        Byte b4 = Byte.valueOf(b1);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        System.out.println("---------------");
        short s1 = 1200;
        Short s2 =Short.valueOf((short) 1200);
        Short s3 =Short.valueOf("1200");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println("---------------");
        boolean bool1 = true;
        Boolean bool2 =Boolean.valueOf(true);
        Boolean bool3 =Boolean.valueOf("true");
        Boolean bool4 =Boolean.valueOf(bool1);

        System.out.println("bool1 = " + bool1);
        System.out.println("bool2 = " + bool2);
        System.out.println("bool3 = " + bool3);
        System.out.println("bool4 = " + bool4);


    }
}
