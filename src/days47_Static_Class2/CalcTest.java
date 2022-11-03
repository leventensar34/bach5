package days47_Static_Class2;

public class CalcTest {

    public static void main(String[] args) {

        Calculator calc=new Calculator(); // static olmayanlari obje olusturarark cagiriyoruz
        calc.toplam(15,5);
        System.out.println("calc.sonuc = " + calc.sonuc);

        calc.carpma(45,60);
        System.out.println("calc.sonuc = " + calc.sonuc);

        CalculatorStatic.toplam(25,50);  // static olanlari direk cagirabiliriz
        System.out.println("CalculatorStatic.sonuc = " + CalculatorStatic.sonuc);

        CalculatorStatic.carpma(5,25);
        System.out.println("CalculatorStatic.sonuc = " + CalculatorStatic.sonuc);

        System.out.println("Math.pow(20.0,2.0) = " + Math.pow(20.0, 2.0)); //Math sinifi kullanilarak yapilabilir
    }
}
