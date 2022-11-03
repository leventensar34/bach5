package days46_Static_Class;

public class Ogrenci {

    private static String okulAd = "Eurotech";
    private static int number = 1000;

    private int ogrNumber;
    String ad;
    String soyad;

    public Ogrenci() {
        nextNumber();
    }

    public Ogrenci(String ad) {
        nextNumber();
        this.ad = ad;
    }

    private void nextNumber() {
        number++;
        this.ogrNumber = number;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okul adi =" + okulAd + " " +
                "ogrNumber=" + ogrNumber +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }

}
