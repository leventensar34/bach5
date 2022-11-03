package days23;

public class multipleArguementDouble {

    public static void main(String[] args) {
        kitleEndeksi("Ali", 23, 1.65, 70.0);
        kitleEndeksi("Sare", 9, 1.28, 35);

    }

    public static void kitleEndeksi(String isim, int yas, double boy, double kilo) {

        double kitleEndeksi = kilo / (boy * boy);

        System.out.println(isim + " isimli kisi " + yas + " yasinda ve kitle endeksi = " + kitleEndeksi);

        if (18.5 < kitleEndeksi && kitleEndeksi < 24.99) {
            System.out.println(isim + " sagliklidir");
        } else {
            System.out.println(isim + " saglikli degildir");
        }

    }


}
