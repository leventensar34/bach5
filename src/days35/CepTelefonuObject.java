package days35;

public class CepTelefonuObject {

    public static void main(String[] args) {

        CepTelefonu cepTel1 = new CepTelefonu();


        System.out.println(cepTel1.marka);
        System.out.println(cepTel1.fiyat);

        cepTel1.marka = "IPhone";
        cepTel1.ekranBoyutu = 3.7;
        cepTel1.renk = "Gri";
        cepTel1.fiyat = 1000;

        System.out.println(cepTel1.marka);
        System.out.println(cepTel1.ekranBoyutu);
        System.out.println(cepTel1.renk);
        System.out.println(cepTel1.fiyat);

        cepTel1.renk = "Lacivert";
        System.out.println(cepTel1.renk);

        System.out.println("------------");

        CepTelefonu cepTel2 = new CepTelefonu();

        cepTel2.marka = "Samsung";
        cepTel2.ekranBoyutu = 5.2;
        cepTel2.renk = "Siyah";
        cepTel2.fiyat = 1500;


        System.out.println(cepTel2.marka);
        System.out.println(cepTel2.ekranBoyutu);
        System.out.println(cepTel2.renk);
        System.out.println(cepTel2.fiyat);

        cepTel1.aramaYap();
        cepTel1.mesajGonder();
        cepTel1.fotografCek();
        cepTel1.interneteGir();

        cepTel2.aramaYap();
        cepTel2.mesajGonder();
        cepTel2.fotografCek();
        cepTel2.interneteGir();







    }

}
