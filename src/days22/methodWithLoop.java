package days22;

public class methodWithLoop {

    public static void main(String[] args) {

        System.out.println("Mian method icindeyim");
        for (int i = 1; i <5 ; i++) {
            mesajGoster();
            System.out.println("Tekrar main method icindeyim");
            System.out.println("--------------");
        }
        System.out.println("Main methodun son kez icerisindeyim");
    }

 public static void mesajGoster(){

     System.out.println("mesaj Goster method icindeyim");

 }

}
