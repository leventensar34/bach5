package Days8_Casting;

public class typePromotion {

    public static void main(String[] args) {

        short number1 = 10;
        short number2 = 20;

        // eror/  short sum=number1+number2
        int sum = number1 + number2;
        System.out.println("sum = " + sum);

        short sum2 = (short) (number1 + number2);
        System.out.println("sum2 = " + sum2);

        //////////
        byte b1 = 2;
        // byte b2=b1*3;
        int b2 = b1 * 3;
        System.out.println("b2 = " + b2);


    }


}
