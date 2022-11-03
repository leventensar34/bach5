package days52_Access_Modifiers;

public class E2 extends E1 {

    public static void main(String[] args) {


    }

    public void test() {  // Bir metodu overreid ediyorsak Child class in access modifieri
        // her zaman parent classinda daha genis yada esit olmali.
        System.out.println("Child Class");
    }
    /*
    void test2(){

    }

     */
}
