package days31;

public class KisiTest {
    public static void main(String[] args) {
        int a;
        Kisi veli;
        veli=new Kisi();
        veli.boy=183;
        veli.cinsiyet='m';
        veli.soyIsim="toprak";
        veli.yas=40;

        Kisi ali=new Kisi();
        ali.yas=25;
        ali.boy=180;
        ali.cinsiyet='m';
        System.out.println(ali.boy);
        System.out.println("veli.boy = " + veli.boy);
        System.out.println("veli.cinsiyet = " + veli.cinsiyet);


    }
}
