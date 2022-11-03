package days43_PassingObject2;

public class ConstructorChain {

    public ConstructorChain(){
        System.out.println("default constructor called");
    }

    public  ConstructorChain(String a){
        this();
        System.out.println(a);
    }

    public  ConstructorChain(String a,int b){
        this();
        for (int i = 0; i <b ; i++) {
            System.out.println(a);
        }
    }


    public static void main(String[] args) {

        ConstructorChain abcConstructor1=new ConstructorChain("merhaba");

        ConstructorChain abc1=new ConstructorChain("Ahmet",5);
    }

}
