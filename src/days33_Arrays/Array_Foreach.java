package days33_Arrays;

public class Array_Foreach {

    public static void main(String[] args) {

        int[] sayilar=new int[3];

        double[] doubleSayilar={1.3,4.5,3.7};

        sayilar[0]=1;
        sayilar[1]=5;
        sayilar[2]=25;

        for (int say : sayilar) {
            System.out.println(say*10);
            System.out.println("say = " + say);
        }


        System.out.println("---------------");

        for (double dbl : doubleSayilar) {

            System.out.println(dbl);
        }


    }
}
