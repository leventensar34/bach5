package Days8_Casting;

public class implicitCasting {

    public static void main(String[] args) {

        int myInt = 9;
        double myDouble = myInt;// implicit casting automatic
        System.out.println(myInt);
        System.out.println(myDouble);

        int i = 100;
        long l = i;
        float f = l;
        double d = f;
        double d2 = i;

        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("d2 = " + d2);


    }

}
