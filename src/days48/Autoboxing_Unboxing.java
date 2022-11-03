package days48;

public class Autoboxing_Unboxing {

    public static void main(String[] args) {

        // Autoboxing--> primitive to wrapper

        Integer num1 = 1234;
        int num2 = 5;
        Integer num3 = num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        //Unboxing -->Wrapper to primitive

        Double d1 = Double.valueOf(25.5);
        double d2 = d1;


        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        int number1 = new Integer(123); //unboxing
        Integer number2 = new Integer(123); //no boxing

        int number3 = number2; //unboxing

        Integer number4=Integer.valueOf(345);
       // Double number5=number4; // wrapper classlar arasi casting mumkun degil

    }
}
