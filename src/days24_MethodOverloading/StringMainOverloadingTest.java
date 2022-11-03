package days24_MethodOverloading;

public class StringMainOverloadingTest {


    public static void main(String[] args) {

        System.out.println("Hi from first main method");

        main("gel","azizim");
        main("nasilsin");

        main("Hello","World");

    }

    public static void main(String str){
        System.out.println("Hi from second main method");
        System.out.println(str);


    }


    public static void main(String str,String str2) {
        System.out.println("Hi from third main method");
        System.out.println(str);
        System.out.println(str2);

    }
}
