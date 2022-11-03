package Practice_AyseHoca.CalisanExample;

public class CalisanTest {

    public static void main(String[] args) {

        Calisan cal1 = new Calisan();
        Calisan cal2 = new Calisan();
        Calisan cal3 = new Calisan();

        int kisi = Calisan.kullaniciSayisi;

        System.out.println(kisi);

        cal1.setEmail("a.gmail.com");
        System.out.println("cal1.getDogumYili(1990) = " + cal1.getDogumYili(1990));

        System.out.println("cal1.birlestir(\"Ahmet\",\"Boz\") = " + cal1.birlestir("Ahmet", "Boz"));

        System.out.println("-----------------------------");

        ChildCalisan child1 = new ChildCalisan();

        child1.setAd("Ahmet");
        child1.setSoyad("Yilmaz");
        child1.setBoy(60);
        child1.okul = " abc Lise";
        child1.yas = 16;
        System.out.println(child1.toString());
        child1.birlestir("Ali", " Veli");


    }
}
