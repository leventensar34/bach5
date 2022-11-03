package days23_Methods2;

import java.util.Scanner;

public class MedhodKdvHesaplama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tutar;
        double KDVTutar;
        while (true) {
            System.out.println("KDV sini hesaplayacaginiz tutari giriniz: ");
            tutar = scan.nextDouble();
            KDVTutar = kdvHesapla(tutar);
            if (tutar == 0) {
                break;
            }

            System.out.println("Hesaplanan KDV : " + KDVTutar);

            double KDVliTutar = tutar + KDVTutar;
            System.out.println("KDV li toplam tutar : " + KDVliTutar);
        }

    }

    public static double kdvHesapla(double tutar) {

        double KdvOran = 0.18;
        double sonuc = KdvOran * tutar;
        return sonuc;

    }

}
