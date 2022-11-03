package days36_MultiDimensionalArrays;

public class Homework_SinavGecme_MultiArray {

    public static void main(String[] args) {


        int[][] puan = {
                {60, 70, 45, 75},
                {10, 30, 50, 50},
                {20, 60, 75, 65},
                {70, 65, 50, 90},
                {5, 40, 30, 40}
        };

        String[] sinav = {"vize1", "vize2", "vize3", "finall"};


        for (int i = 0; i < puan.length; i++) {
            double ortalama = 0;
            System.out.println("----------------");
            for (int j = 0; j < puan[i].length; j++) {
                System.out.println((i + 1) + ". ogrencinin " + sinav[j] + " notu: " + puan[i][j]);

                ortalama = (((puan[i][0] + puan[i][1] + puan[i][2])/3 * 0.30) + (puan[i][3]) *0.70);


            }
            System.out.println();
            if (ortalama >=50) {
                System.out.println((i+1)+". ogrenci sinifi "+ortalama+" ortalama ile gectiniz.");
            }else {
                System.out.println((i+1)+". ogrenci sinifi "+ortalama+" ortalama ile gecemediniz.");

            }
        }
    }
}
