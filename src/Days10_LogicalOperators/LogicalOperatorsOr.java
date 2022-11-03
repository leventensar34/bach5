package Days10_LogicalOperators;

public class LogicalOperatorsOr {
    public static void main(String[] args) {

        int x=8;
        int y=5;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x > y ? = "+ ((x>y)||(y>x)));
        System.out.println("x > y ? = "+ ((x>y)||!(y>x)));

        System.out.println("x > y ? = "+ ((x>y)||(x==(y+=3))));
        System.out.println("y = " + y);

        y=5;
        //short circuit &&
        System.out.println("y > x ? = "+ ((y>x)||(x==(y+=3))));
        System.out.println("y = " + y);

        //&
        System.out.println("y > x ? = "+ ((y>x)|(x==(y+=3))));
        System.out.println("y = " + y);



    }

}
