package days41_Constructors_passingObjM;

public class SadeKek {


    String name;
    int un;
    int seker;
    int yag;
    int yumurta;
    int  sut;
    int kabartmaTozu;

    public SadeKek(){
        System.out.println("Nesne olustu");
        un=100;
        seker=15;
        yag=35;

    }

    public SadeKek(String name) {
        this();
        this.name = name;
    }

    public SadeKek(String name, int un, int seker, int yag, int yumurta, int sut, int kabartmaTozu) {
        this.name = name;
        this.un = un;
        this.seker = seker;
        this.yag = yag;
        this.yumurta = yumurta;
        this.sut = sut;
        this.kabartmaTozu = kabartmaTozu;

    }
}
