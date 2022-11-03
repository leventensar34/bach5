package days25_Object_Class;

public class MobilePhoneObject {

    public static void main(String[] args) {

        MobilePhone phone1 = new MobilePhone();

        phone1.marka="IPhone";
        phone1.model="X";
        phone1.renk="Gri";
        phone1.ekranBoyutu=8.5;
        phone1.fiyat=1250;

        System.out.println("--------Urun Bilgileri--------");
        System.out.println("Ceptelefonun Markasi = " + phone1.marka);
        System.out.println("Ceptelefonun Modeli = " + phone1.model);
        System.out.println("Ceptelefonun rengi= " + phone1.renk);
        System.out.println("Ceptelefonun Ekran boyutu = " + phone1.ekranBoyutu+" inc");
        System.out.println("Ceptelefonun Fiyat = " + phone1.fiyat+" $");

        phone1.arama();
        phone1.mesajAt();
        phone1.fotografCek();
        phone1.navigasyonaBaglanma();




    }
}
