package days39_WrappersClass2;

public class WrappersToPrimitive {

    public static void main(String[] args) {

        Integer obj1=Integer.valueOf(5);
        Double obj2=Double.valueOf(5.35);
        Boolean obj3=Boolean.valueOf(true);

        int num1=obj1.intValue();
        double num2=obj2.doubleValue();
        boolean b=obj3.booleanValue();
        int num3=obj2.intValue();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("b = " + b);
        System.out.println("num3 = " + num3);




    }
}
