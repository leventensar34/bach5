package days24_MethodOverloading;

public class Method_YearsUntilRetirement {

    public static void main(String[] args) {
        int yas = calculateAge(1990);
        yearsUntilRetirement("Bekir",yas);
        yearsUntilRetirement("Bekir",calculateAge(1990));
        //Başka bir metoda parametre olarak değer döndüren başka bir metod sonucunun gönderilmesi



    }


    public static int calculateAge(int dogumYili){
        int buYil = 2022;
        int age=0;
        age = buYil - dogumYili;
        return age;
    }

    public static void yearsUntilRetirement(String ad, int yas){
        int emeklilikYasi = 65;
        int emekliligeKalanSure = emeklilikYasi - yas;
        System.out.println(ad + " retires in " + emekliligeKalanSure + " years" );
    }


}
