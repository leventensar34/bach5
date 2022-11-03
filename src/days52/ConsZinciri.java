package days52;

public class ConsZinciri {

    int sayi;
    String isim;

/// !!!! Dikkat  zincirleme cons baska bir cons icinde cagrilirsa ilk satirda yazilmasi lazim
    // Zincirleme cons cagrilirken hiyerarsiye dikkat etmek lazim.Tek parametrelinin icine default consu, 2 parametreli
    // cons un icinede tek parametreli cons cagrilir.Kendi kendini kendi icinde cagiramayiz

    public ConsZinciri() {  //Default Constructer

        System.out.println("Default Constructer");
    }

    public ConsZinciri(int sayi) {
        this();
        System.out.println(" 1 int parametreli cons");
    }

    public ConsZinciri(String name) {
        this(2);
        System.out.println(" 1 String parametreli cons");
    }

    public ConsZinciri(int sayi, String isim) {
        this("Google");
        System.out.println(" 1 int, 1 String--> 2 parametreli cons");

    }

}
