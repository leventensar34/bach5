package Days11_Review;

public class Odev_Basamaklara_Ayirma {

    public static void main(String[] args) {

         /*
        Verilen bir tamsayıyı aritmetik işlemler kullanarak basamaklarına ayıran ve basamakları ve
        basamakların toplamını ekrana yazdıran bir program yazın.

        Örnek ekran çıktısı

         sayi= 1234

         Birler basamağı = 4;
         Onlar basamağı = 3;
         yüzler basamağı = 2;
         Binler basmağı = 1;

         Basamakların toplamı = 10;
     */
        int sayi = 1234;
        int digit1, digit2, digit3, digit4, sum;

        digit1 = sayi % 10;
        System.out.println("digit1 = " + digit1);

        digit2 = (sayi / 10) % 10;
        System.out.println("digit2 = " + digit2);

        digit3 = (sayi / 100) % 10;
        System.out.println("digit3 = " + digit3);

        digit4 = (sayi / 1000) % 10;
        System.out.println("digit4 = " + digit4);

        sum = digit1 + digit2 + digit3 + digit4;

        System.out.println("sayi = " + sayi);
        System.out.println("sum = " + sum);
    }

}
