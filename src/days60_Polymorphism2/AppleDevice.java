package days60_Polymorphism2;

public class AppleDevice {

    public void use(){
        System.out.println("AppleDevice run");
    }
}

class Mac extends AppleDevice{

    public void use(){
        System.out.println("Mac run");
    }

    public void code(){
        System.out.println("Mac is coding...");
    }
}

class Ipad extends AppleDevice{

    public void use(){
        System.out.println("AppleDevice run");
    }


    public void draw(){
        System.out.println("Drawing on Ipad...");
    }
}

class AppleWatch extends AppleDevice{

    public void use(){
        System.out.println("AppleWatch run");
    }

    public void wear(){
        System.out.println("wearing AppleWatch");
    }

}

class AppleStore{

    public static void main(String[] args) {

        AppleDevice mac=new Mac();
        mac.use();
      //  mac.code(); // not: Referansi paren class ta olmadigi icin bu metodu goremiyoruz

        Mac mac1=new Mac();
        mac1.use();
        mac1.code();

        AppleDevice watch=new AppleDevice();
        watch.use();
       // watch.wear();  // not: Referansi paren class ta olmadigi icin bu metodu goremiyoruz






    }
}