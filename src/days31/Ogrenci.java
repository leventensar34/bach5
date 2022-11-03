package days31;

import java.util.ArrayList;

public class Ogrenci {
    String gozRengi;
    String sacRengi;
    String uyruk;
    char cinsiyet;
    int yas;
    int boy;
    double kilo;

    public static void main(String[] args) {
        Ogrenci Ali=new Ogrenci();

        Ali.gozRengi="mavi";
        Ali.sacRengi="Kumral";
        Ali.uyruk="Turk";
        Ali.cinsiyet='m';
        Ali.yas=25;
        Ali.boy=175;
        Ali.kilo=72.0;
        System.out.println("Ali.gozRengi = " + Ali.gozRengi);
        System.out.println("Ali.sacRengi = " + Ali.sacRengi);
        System.out.println("Ali.uyruk = " + Ali.uyruk);
        System.out.println("Ali.cinsiyet = " + Ali.cinsiyet);
        System.out.println("Ali.yas = " + Ali.yas);
        System.out.println("Ali.boy = " + Ali.boy);
        System.out.println("Ali.kilo = " + Ali.kilo);


    }

}
