package days47_Static_Class2;

public class Single {

    private static Single instance;
    static int numberOfInstance=0;

    private Single() {  //Default cons i encapsulation yaptik

        System.out.println("Instance has created");
        numberOfInstance++;
    }

    public static Single createInstance() {

        // Bu durumda sadece bir tane instance uretir
        if (instance==null){
            instance = new Single();

        }
        /*
        if (numberOfInstance < 2) {
            instance = new Single();
        }
        */
        return instance;
    }

}
