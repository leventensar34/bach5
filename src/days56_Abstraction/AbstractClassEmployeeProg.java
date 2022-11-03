package days56_Abstraction;

public class AbstractClassEmployeeProg {

    public static void main(String[] args) {

        KadroluCalisan calisan1=new KadroluCalisan();
        calisan1.firstName="Ahmet";
        calisan1.lastName="Falanca";
        calisan1.yillikMaas=45000;

        System.out.println("---Kadrolu calisan---");
        System.out.println(calisan1.tamAdi());
        System.out.println("Aylik maas : "+calisan1.aylikMaas());

        System.out.println("-----------------------------");
        System.out.println("---Saat ucretli calisan---");

        SaatlikCalisan saatCalisan1=new SaatlikCalisan();
        saatCalisan1.id=234;
        saatCalisan1.firstName="Ali";
        saatCalisan1.ikinciAd="Veli";
        saatCalisan1.lastName="Saat";
        saatCalisan1.saatUcreti=12;
        saatCalisan1.toplamCalismaSaati=125;

        System.out.println(saatCalisan1.tamAdi());
        System.out.println("Aylik maas : "+saatCalisan1.aylikMaas());


    }
}
