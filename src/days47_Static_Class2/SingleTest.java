package days47_Static_Class2;

public class SingleTest {

    public static void main(String[] args) {

/*
        Single sngl1=new Single();
        Single sngl2=new Single();
        Single sngl3=new Single();
        Single sngl4=new Single();
*/
        System.out.println("Single.numberOfInstance = " + Single.numberOfInstance);

       Single sgnl1= Single.createInstance();
       Single sgnl2= Single.createInstance();
       Single sgnl3= Single.createInstance();

        System.out.println("Single.numberOfInstance = " + Single.numberOfInstance);

    }
}
