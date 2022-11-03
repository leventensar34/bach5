package days22;

public class debuggingMethodCall {

    public static void main(String[] args) {

        System.out.println("main metod icindeyim: line 7");

        method2();

        System.out.println("tekrar main metod icindeyim: line 11");
    }

public static void method2(){


    System.out.println("method2 nin icindeyim : line 17");

}


}
