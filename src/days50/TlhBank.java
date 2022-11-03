package days50;

public class TlhBank {


    // Default-no Argument Constructor metodlarin 2 kurali
    // 1- Class ismi metod ismi ayni olmak zorunda
    //2- Herhangi bir Return Type (void,int,String..) olmayacak!!
    // Gorevi: Objelerin degerlerin default degerini saglar
    // Eger bir class ta hic bir constractor metod yoksa , compiler otomatikmen gizli bir default constractor metodunu olusturur.
    public TlhBank() {
        bankaAdi = "Ensar";
        hesapAktifmi = true;
        musteriSayisi++;
    }

    public TlhBank(boolean hesapAktifmi, String tlhBank, String hesapSahibi, String s, String eur, String ankara, String vadeli, long hesapNo, double karOrani) {
        this.hesapNo = hesapNo;


    }

    public TlhBank(int hesapNo, double bakiye) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;

    }

    public TlhBank(String paraBirimi, double bakiye) { // TL hesabi icin eger 10000 tl uzeri hesap acarsa 50 tl bonus para ekle
        this.paraBirimi = paraBirimi;                  // EUR hesabi icin eger 2000 € uzeri hesap acarsa 10€ bonus para ekle
        this.bakiye = bakiye;
        if (paraBirimi.equals("TL") && bakiye >= 10000) {
            this.bakiye += 50;
            System.out.println(" Tebrikler , Hesabiniz acildi ve bonus olarak 50 TL hesabiniza eklendi");
        } else if (paraBirimi.equals("EUR") && bakiye >= 2000) {
            this.bakiye += 10;
            System.out.println(" Tebrikler , Hesabiniz acildi ve bonus olarak 10 € hesabiniza eklendi");
        }else {
            System.out.println("Tebrikler, Hesabiniz acildi");
        }
    }

    public TlhBank(boolean hesapAktifmi, String bankaAdi, String hesapSahibi, long hesapNo, String paraBirimi, String subeAdres, String hesapTuru, double bakiye, double karOrani) {

        this();
        this.hesapAktifmi = hesapAktifmi;
        this.bankaAdi = bankaAdi;
        this.hesapSahibi = hesapSahibi;
        this.hesapNo = hesapNo;
        this.paraBirimi = paraBirimi;
        this.subeAdres = subeAdres;
        this.hesapTuru = hesapTuru;
        this.bakiye = bakiye;
        this.karOrani = karOrani;
    }


    public static int musteriSayisi = 0;
  public   boolean hesapAktifmi;

 public    String bankaAdi;
  public   String hesapSahibi;

   public long hesapNo;

  public   String paraBirimi;

  public   String subeAdres;

  public   String hesapTuru;

  public   double bakiye;

   public double karOrani;


    public void paraYatir() {


    }

    public void paraCek() {


    }


}
