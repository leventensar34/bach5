package days24;

public class ReviewOrtalama {

    public static void main(String[] args) {

int ortalama=ortalamaBulma(120,240,130);
        System.out.println("ortalama = " + ortalama);

int ortalama2=ortalamaBulma(20,76,98);
        System.out.println("ortalama2 = " + ortalama2);

        int ortalam3=ortalamaBulma(45,83,90);
        System.out.println("ortalam3 = " + ortalam3);

    }
    public static int ortalamaBulma(int num1,int num2,int num3){

      int  ortalama=(num1+num2+num3)/3;

     return ortalama;


    }




}
