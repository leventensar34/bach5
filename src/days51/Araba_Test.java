package days51;

public class Araba_Test {

    public static void main(String[] args) {

        Araba honda=new Araba();
        honda.model="Jazz";
        Araba toyota=new Araba();
        toyota.model="Yaris";
        Araba BMW=new Araba(2);

        System.out.println("honda.model = " + honda.model);
        System.out.println("toyota.model = " + toyota.model);

        honda.kapi=4;
        toyota.kapi=2;
        System.out.println("honda.kapi = " + honda.kapi);
        System.out.println("toyota.kapi = " + toyota.kapi);

        honda.fiyat=100000;
        toyota.fiyat=150000;



    }
}
