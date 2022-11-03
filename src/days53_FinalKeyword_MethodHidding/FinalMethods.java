package days53_FinalKeyword_MethodHidding;

public class FinalMethods {


    public  void method1(){
        System.out.println("Method-1");
    }

    public static void staticMethod(){
        System.out.println("Static Method");
    }

    class Sub extends FinalMethods{

        public final void method1(){
            System.out.println("Method-1 Sub class");
        }

        public static void staticMethod(){
            System.out.println("Static Method Sub class");
        }

    }
    class Sub2 extends Sub{

        /*
        public  void method1(){
            System.out.println("Method-1 Sub class");
        }
        */
    }
}
