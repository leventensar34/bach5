package Practice_AyseHoca.Meyve;

import java.util.Scanner;

public class MeyveTest {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Muz fiyati hesaplama icin: 1\n"
                + "Kiraz fiyati hesaplamak icin: 2\n"
                + "Elma fiyati hesaplamak icin :3\n"
                + "'e basiniz");
        System.out.println("Lutfen bir sayi giriniz : ");
        int y = scanner.nextInt();
        double n;
        switch (y) {
            case 1:
                Muz muz = new Muz();
                muz.meyveAdi();
                System.out.println("Kac kilo :");
                n = scanner.nextDouble();
                muz.alinanKilo(n);
                muz.fiyat();
                break;
            case 2:
                Kiraz kiraz = new Kiraz();
                kiraz.meyveAdi();
                System.out.println("Kac kilo :");
                n = scanner.nextDouble();
                kiraz.alinanKilo(n);
                kiraz.fiyat();
                break;
            case 3:
                Elma elma = new Elma();
                elma.meyveAdi();
                System.out.println("Kac kilo :");
                n = scanner.nextDouble();
                elma.alinanKilo(n);
                elma.fiyat();
                break;
            default:
                System.out.println("Meyve yok");
        }
    }
}
