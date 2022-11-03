package Days9_Unary_Assigment_Relation;

public class prepostDecrementIncrement2 {
    public static void main(String[] args) {

        int x=50;
        int y=--x + x++ + x-- + x++;

        // x--49--50--49--50  x=50
        //y--49--49--50--49  y=197


        System.out.println("x = " + x); //50
        System.out.println("y = " + y); //197


    }


}
