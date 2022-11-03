package days21_Methods1;

public class DebbugingMethod {

    public static void main(String[] args) {

        System.out.println("Main methodun icindeyim: line 7");

        method();
        System.out.println("Tekrar main method icindeyim: line 10");

    }

    public static void method(){

        System.out.println("Method icindeyim: line 16");
    }
}
