package days55_Composition;

public class Sub extends Super {


    public static boolean question() {  //static olmazsa overrid olur
        return true;
    }

    public  void getSubDescription() {
        System.out.println("Description "+question());
    }
}
