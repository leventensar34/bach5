package Days10_LogicalOperators;

public class InterviewQuestion {

    public static void main(String[] args) {
        System.out.println("İnterview Sorusu");

        /* Sayı1 ve Sayı2 değişkenlerine atana değerleri birbirleriyle değştiren bir program yazın.
        1- Sayi1 ve Sayi2 adında ik değişken tanımla
        2-Bu değişkenlere 10 ve 20 tamsayılarını atayalım
        3-Sayı1=10
        4-Sayı2=20
        5- temp adından yeni bir değişken tanımla.
        6- temp = Sayı2
        7- Sayı2 = Sayı1
        8- Sayı1 = temp
        9- Sayı1 ve Sayı2 yazdır.

         */
     ///// 3. bir  degisken ile cozum
        int sayi1, sayi2;
        int temp;
        sayi1 = 10;
        sayi2 = 20;

        System.out.println("İşlemden önceki Sayı1 ve Sayı2 nin değerleri");
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println();

        temp = sayi2;
        sayi2 = sayi1;
        sayi1 = temp;
        System.out.println("İşlemden sonraki Sayı1 ve Sayı2 nin değerleri");
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println();
        System.out.println();

    ////////// 3. bir degisken olmadan cozum

        System.out.println("temp değişken kullanmadan SWAP işlemi (temp değişken olmadan)");

        sayi1 = 30;
        sayi2 = 20;

        System.out.println("İşlemden önceki Sayı1 ve Sayı2 nin değerleri");
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println();

        sayi1 = sayi1 + sayi2;// 10 + 20 = 30 Sayi1 = 30
        System.out.println("sayi1(say1+sayı2)= " + sayi1);
        System.out.println();

        sayi2 = sayi1 - sayi2; //30 - 20 = 10 Sayi2 = 10,
        System.out.println("sayi2 (Sayı1-Sayı2) = " + sayi2);
        System.out.println();

        sayi1 = sayi1 - sayi2; // 30 - 10 = 20 Sayi1 = 20
        System.out.println("sayi1 = " + sayi1);

        System.out.println("İşlemden sonraki Sayı1 ve Sayı2 nin değerleri");
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);




    }

}
