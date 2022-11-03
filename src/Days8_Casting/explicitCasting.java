package Days8_Casting;

public class explicitCasting {

    public static void main(String[] args) {

        double myDouble=9.78;
        int myInt=(int)myDouble; // Explicitcasting - manuel

       double  myDouble2=myInt;


        System.out.println(myDouble);
        System.out.println(myInt);
        System.out.println(myDouble2);

        double d=100.04;
        long l=(long)d;
        int i=(int)l;

        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("i = " + i);

    }


}
