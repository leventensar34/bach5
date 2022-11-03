package days28;

public class ReviewIfTask2 {
    public static void main(String[] args) {

//        We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble
//        if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//
//        parrotTrouble(true, 6) → true
//        parrotTrouble(true, 7) → false
//        parrotTrouble(false, 6) → false
// iki degiskenden biri int digeri boolean, eger saat 7 den once ve 20 den sonra konusuyor ise problem var
// ve true dondur yoksa false dondur

        int saat = 6;
        boolean konusuyor = true;
        if (konusuyor) {
            if (saat < 7 || saat > 20) {
                System.out.println("true = " + true);
            } else {
                System.out.println(false);
            }
        } else {
            System.out.println(false);
        }

        System.out.println("---------");

        boolean sonuc = konusuyor&&(saat < 7 || saat > 20) ? true : false;
        System.out.println("sonuc = " + sonuc);
    }

}
