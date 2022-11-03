package Practice_AyseHoca.CalisanExample;

public class User {

    /*
    Task:
 - name,caunty intance ları ve showInfo methodu bulunan User adında parent class oluşturun
 - premiumUser adında subClass oluşturun, price instance bulunsun, showInfo methodunu override etsin
 - NormalUser adında bir subClass daha oluşturun
 -main methodunda polymorphism özelleklerini kullanarak classlardaki değerleri run edin
     */
   public String name,country;

    public User(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public void showInfo(){
        System.out.println("Kullanici adi: "+name);
        System.out.println("Kullanici ulke: "+country);
    }

}
class PremiumUser extends User{

    double price;

    public PremiumUser(String name, String country, double prise) {
        super(name, country);
        this.price = price;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Kullanicinin odedigi ucret : "+price);
    }
}
class NormalUser extends User{

    public NormalUser(String name, String country) {
        super(name, country);
    }
}
class UserTest {

    public static void main(String[] args) {

        User u1 = new PremiumUser("Ahmet","Almanya",2000); //Polimorphic object
        u1.showInfo();

        System.out.println("----------------");
        User u2=new User("Ali","Amerika"); // Normal object
        u2.showInfo();

        System.out.println("----------------");
        User u3=new NormalUser("Ayse","Turkiye"); //Polymorphic object
        u3.showInfo();
    }
}

