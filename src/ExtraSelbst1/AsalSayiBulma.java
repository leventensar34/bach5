package ExtraSelbst1;

public class AsalSayiBulma {

    public static void main(String[] args) {

        int num = 43;
        boolean asal = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                asal = false;
                break;

            }

        }
        if (asal) {
            System.out.println("Girilen sayi: " + num + " asaldir");
        }else{
            System.out.println("Girilen sayi: "+num+" asal degildir");
        }


    }
}
