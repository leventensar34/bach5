package days55_Composition;

public class Super {


    public static boolean question() { //static olmazsa overrid olur
        return false;
    }

    public  void getSuperDescription() {
        System.out.println("description "+question());
    }
}
