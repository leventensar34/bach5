package days48;

public class WrapperToPrimitive {

    public static void main(String[] args) {

        //Create Wrapper object

        Integer obj1 = Integer.valueOf(25);
        Double obj2 = Double.valueOf(15.5);
        Boolean obj3 = Boolean.valueOf(true);

        //  Convert  wrapper object to primitive

        int num1 = obj1.intValue();
        double num2 = obj2.doubleValue();
        boolean b = obj3.booleanValue();
        int num4 = obj2.intValue();
        double num5 = obj1.doubleValue();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(b);
        System.out.println(num4);


    }
}
