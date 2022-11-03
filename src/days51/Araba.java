package days51;

public class Araba {

    String model; // instans variable
    static int yil = 2002;
    int kapi;
    double fiyat;
    static int üretilenObjeSayisi;


    Araba(int door){
      this.kapi=door;
      üretilenObjeSayisi++;
        System.out.println("Arabadan bir obje olusturuldu");
    }

    Araba(){

    }

}
