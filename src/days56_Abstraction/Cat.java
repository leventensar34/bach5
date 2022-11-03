package days56_Abstraction;

public class Cat extends Animal {

//    public  String name;
//    public String color;  // Miras olak aliyor



    public void createSound(){
        System.out.println(this.name+" miyavliyor");
    }

    public void sleep(){
        System.out.println(this.name+" su an  uyuyor..zzzzzzz");
    }

  /* Tekrardan bu kodu yazmaya gerek yok
    public String printInfo() {
        return "My name is : " + this.name + " ," + "My color is : " + color;
    }
    */
}
