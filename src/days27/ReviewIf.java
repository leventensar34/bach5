package days27;

public class ReviewIf {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        boolean sonuc = a > b;
        // compalir if blogunun icinde ilk dogru hangisi ise onu yazdirir ve sonra disari cikar.
        // tumunu yazdirmak istersek her zaman ayri ayri ifler ile belitmemiz lazim.

        if (a > b) {
            System.out.println(" a  b den kucuktur");
        } else if (c > b) {
            System.out.println(" b  a dan buyuktur");
        } else if (b < c) {
            System.out.println(" c  b den buyuktur");
        }else{
            System.out.println(" sartlardan hicbiri dogru degil ");
        }

        System.out.println(" if blogu bitti ");
    }

}
