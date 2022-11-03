package days50;

public class Test {

    public static void main(String[] args) {


        TlhBank tlHesap = new TlhBank("TL", 10000);

        System.out.println("tlHesap.bakiye = " + tlHesap.bakiye);

        TlhBank dolarHesap = new TlhBank("USD",20000);
        System.out.println("dolarHesap.bakiye = " + dolarHesap.bakiye);

        TlhBank euroHesap=new TlhBank("EUR",12000);
        System.out.println("euroHesap.bakiye = " + euroHesap.bakiye);

    }
}
