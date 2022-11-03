package days23_Methods2;

import java.util.Scanner;

public class MethodKdv2 {

    public static void main(String[] args) {
        Scanner tutarGir = new Scanner(System.in);

        double tutar; //Klavyeden girdiğimiz
        double KDVTutar = 0.0; //Klavyeden girilen tutarın KDV'si
        double KDVYekun = 0; //Toplam KDV
        double TutarYekun = 0; //Girilen tutarların toplamı
        double genelToplam = 0 ; // Genel toplam

        while (true){
            System.out.print("KDV sini hesaplayacağınız ürün tutarı giriniz : ");
            tutar = tutarGir.nextDouble();

            if (tutar==0){
                break;
            }
            KDVTutar =  kdvHesapla(tutar); //KDV hesaplamak için metodu çağırıyoruz.
            KDVYekun += KDVTutar;
            TutarYekun+= tutar;
            genelToplam = KDVYekun + TutarYekun;

        }
        System.out.println();
        System.out.println("KDV'siz toplam ...........: " + TutarYekun);
        System.out.println("Hesaplanan KDV Yekunu ....: " + KDVYekun);
        System.out.println("KDV'li Genel toplam tutar : " + genelToplam);

    }
    public static double kdvHesapla(double tutar){
        double KDV_oran = 0.18;
        double sonuc =KDV_oran * tutar;
        return sonuc;
    }



}



