package Days9_Unary_Assigment_Relation;

public class Homework {

    public static void main(String[] args) {
    /*    int a = 1;
        int result = -a-- + a++ / -a-- * --a;
        System.out.println("a = " + a);
        System.out.println("result = " + result); */
        int a = 1;
        int result;

        int result1, result2, result3, result4;

        result1 = -a--;
        result2 = a++;
        result3 = -a--;
        result4 = --a;
        result = result1 + result2 / result3 * result4;
        System.out.println("a = " + a);
        System.out.println("result = " + result);


        //////////////

        int x = 4;
        int y = x * 4 - x++;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }

}
