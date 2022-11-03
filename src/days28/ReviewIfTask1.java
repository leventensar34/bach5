package days28;

public class ReviewIfTask1 {

    public static void main(String[] args) {
        // Give 2 int values , return true if one is negative and one is pozitive.Except if the parameter "negativ"
        // is true, then return true only if both are negative
        //(1,-1,false)--> true
        // (-1,1,false)-->true
        // (-4,-5,true)-->true
        int a = -4;
        int b = -3;
        boolean deger = false;

        if (deger) {
            if (a < 0 && b < 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else if (!deger) {
            if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }


    }

}
