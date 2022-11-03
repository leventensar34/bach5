package days24;

public class ReviewMethod {

    public static void main(String[] args) {

        String yasDeger="";
        yasDeger=metodCagiralim(1980,2022,"Ali");
        String fatihinYasi=metodCagiralim(1993,2022,"Fatih");
        System.out.println(yasDeger);
        System.out.println(fatihinYasi);
    }

    public static String metodCagiralim(int dogum_tarihi, int mevcutYil, String isim) {

        System.out.println("parametresiz metot ");

        int yas = mevcutYil - dogum_tarihi;
        return isim + " nin yasi =" + yas;

    }


}
