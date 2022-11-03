package Days15_Ternary;

public class Task {
    public static void main(String[] args) {
        ///// mutlak deger sorusu
        int sayi = -45;
        int sonuc = (sayi >= 0) ? sayi : -sayi;
        System.out.println("sonuc = " + sonuc);

        //////////////task: ucgenin uygunlugu

        double a=6;
        double b=10;
        double c=8;

        String result=((a+b)>c && (a+c)>b && (b+c)>a)? "Bu bir ucgendir":"Bu bir ucgen degildir";
        System.out.println("result = " + result);

    /////////

        String name = "Ali Topaloglu";
        int yas = 10;
        String kayit = (yas >= 18 && yas <= 65) ? "Hi " + name + " you are qualified" : " you typed wrong age";
        System.out.println("kayit = " + kayit);



    }
}
