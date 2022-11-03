package days28_Random_Math_Date;

import java.util.Random;

public class Exercise3 {

    public static void main(String[] args) {


        int deger;


        Random random=new Random();

        while (true){
            deger= random.nextInt(100)+1;


            if (deger>90){
                System.out.println("Number "+deger+" : STOP! Max number exceeded!!");
                break;
            }else{
                System.out.println("Random Number: "+deger);
            }
        }

    }
}
