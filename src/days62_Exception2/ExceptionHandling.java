package days62_Exception2;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str="Ahmet Falanaca";
        int intA=0;
        System.out.println(str);

        while (true){
           // intA++;  // int sinirina kadar gider durur.
            str+=str;  // surekli obje urettigi icin heap hafizayi doldurur ve eror verir. OutOfMemoryEror hatasi verir
            System.out.println("\n" + str);
        }

    }
}
