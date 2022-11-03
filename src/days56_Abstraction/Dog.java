package days56_Abstraction;

public class Dog extends Animal {

//    public String name;
//    public String color;  //Bu degerleri miras aliyor


    public void createSound() {
        System.out.println(this.name + " havliyor");
    }

    public void sleep() {
        System.out.println(this.name + " su an uyuyor..zzzzzzz");
    }

    /* Animal sinifindan implemend edildi
    public String printInfo() {
        return "My name is : " + this.name + " ," + "My color is : " + color;
    }

     */
}
