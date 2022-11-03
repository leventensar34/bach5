package days27;

public class ReviewTaskIcyHot {

    public static void main(String[] args) {

        /// given two temperatur,return true if one is less than 0 and the other is greater than 100.
        // (120,-1) -->true
        // (-1,120) -->true
        // (4,120) -->false

        int x = -5;
        int y = 101;
        if ((x < 0 && y > 100) || (x > 100 && y < 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
