package days41_Constructors_passingObjM;

public class MakeCake {

    public static void main(String[] args) {

        Cake sadeKek = new Cake();
        sadeKek.name="Sade kek";
        sadeKek.un = 100;
        sadeKek.seker = 30;
        sadeKek.yag = 35;
        sadeKek.kabartmaTozu = 5;
        sadeKek.sut = 1;
        sadeKek.yumurta = 1;

        SadeKek sadeKek1 = new SadeKek();
        sadeKek1.name="Sade kek1";
        sadeKek1.un = 100;
        sadeKek1.seker = 30;
        sadeKek1.yag = 35;
        sadeKek1.kabartmaTozu = 5;
        sadeKek1.sut = 1;
        sadeKek1.yumurta = 1;

        PortakalliKek portakalliKek = new PortakalliKek();
        portakalliKek.name="Portakalli kek";
        portakalliKek.un = 100;
        portakalliKek.seker = 30;
        portakalliKek.yag = 35;
        portakalliKek.kabartmaTozu = 5;
        portakalliKek.sut = 1;
        portakalliKek.yumurta = 1;
        portakalliKek.portakal = 1;

        CevizliKek cevizliKek = new CevizliKek();
        cevizliKek.name="Cevizli kek";
        cevizliKek.un = 150;
        cevizliKek.seker = 30;
        cevizliKek.yag = 35;
        cevizliKek.kabartmaTozu = 5;
        cevizliKek.sut = 1;
        cevizliKek.yumurta = 1;
        cevizliKek.ceviz = 1;

        PortakalliCikolataliKek portakalliCikolataliKek=new PortakalliCikolataliKek();
        portakalliCikolataliKek.cikolata=1;
        portakalliCikolataliKek.name="Portakalli cikolatali";
        portakalliCikolataliKek.un=10;

        System.out.println(portakalliKek.name);
        System.out.println(portakalliKek.un);
        System.out.println(portakalliKek.seker);

        System.out.println("portakalliCikolataliKek.name = " + portakalliCikolataliKek.name);
        System.out.println("portakalliCikolataliKek.un = " + portakalliCikolataliKek.un);


    }
}
