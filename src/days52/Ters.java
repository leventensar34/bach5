package days52;

public class Ters {

    int sayi;

    String kelime;


    public Ters(){

        this(1,"ornek");
        System.out.println("Default cons");

    }

    public Ters(int sayi){
        this();
        System.out.println("1 parametreli cons");
    }

    public Ters(int sayi,String kelime) {
        System.out.println("2 parametreli cons");

    }


    public static void main(String[] args) {

        Ters tersObj=new Ters();



    }


}
