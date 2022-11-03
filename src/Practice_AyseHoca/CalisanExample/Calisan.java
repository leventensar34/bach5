package Practice_AyseHoca.CalisanExample;

public class Calisan {

    /*
    Kişinin adı, soyadı, email, dogum yılı, boy, kilo bilgisi alınsın.Private olara tanımlansın
    //Email kontrolü yapılsın. Eğer içinde @ işareti yoksa “Geçersiz Mail” olarak kayıt yapılsın.
    //getYas() adında bir metot olsun. Kullanıcının yaş bilgisini döndürsün. (2022’den çıkartarak)
    //Kaç kullanıcı eklendiği bilgisi alınabilsin. (Static değişken)
    //Ad ile Soyad bilgisi oluşturulan bir fonksiyonla alınabilsin.(ad ve soyadı birleştiren)
     */

    private String ad;
    private String soyad;
    private String email;
    private int dogumYili;
    private int boy;
    private int kilo;
    static int kullaniciSayisi = 0;

    public  Calisan() {
        kullaniciSayisi++;
    }

    public int getDogumYili(int dogumYili) {
        int yas = 2022 - dogumYili;
        return yas;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public String  birlestir(String ad, String soyad) {
        String result = ad.concat(soyad);
        return result;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;

    }
    public void setEmail(String email) {
        this.email = email;
        if (email.contains("@")) {
            System.out.println("Gecerli email");
        }else{
            System.out.println("Gecersiz email");
        }

    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public static int getKullaniciSayisi() {
        return kullaniciSayisi;
    }

    public static void setKullaniciSayisi(int kullaniciSayisi) {
        Calisan.kullaniciSayisi = kullaniciSayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", email='" + email + '\'' +
                ", dogumYili=" + dogumYili +
                ", boy=" + boy +
                ", kilo=" + kilo +
                '}';
    }
}
