package days59_Polymorphism;

public class CompileTimePolyTest {

    public static void main(String[] args) {

        // Compile-Time static Polymorphism
        System.out.println(CompileTimePoly.Multiply(2,3));
        System.out.println(CompileTimePoly.Multiply(2,3,4));
        System.out.println(CompileTimePoly.Multiply(2.0,3.5));

    }
}
