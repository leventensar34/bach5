package days46_Static_Class;

public class NumberOfObject {

  static int numberOfObject;

    public NumberOfObject() {
        numberOfObject++;
    }

    public static void main(String[] args) {


        NumberOfObject nmbrObj=new NumberOfObject();
        NumberOfObject nmbrObj1=new NumberOfObject();
        NumberOfObject nmbrObj2=new NumberOfObject();
        NumberOfObject nmbrObj3=new NumberOfObject();


        System.out.println("Number of object: "+NumberOfObject.numberOfObject);

    }
}
