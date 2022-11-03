package days33_Arrays;

public class Varargs {

    public static void main(String[] args) {

int sonuc=toplama(15,5,6,7,8,9,1);
        System.out.println("sonuc = " + sonuc);

        int sonuc1=toplama(1,2,3,4);
        System.out.println("sonuc1 = " + sonuc1);
    }

    // Variables Arguments passing to a method
    public static int toplama(int... sayilar){
int toplam=0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam=toplam+sayilar[i];
        }

        return toplam;
    }


}
