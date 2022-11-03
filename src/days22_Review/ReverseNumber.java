package days22_Review;

public class ReverseNumber {
    public static void main(String[] args) {

        int number=458443;
        int reverseNumber=0;
        while (number!=0){

           int digit=number%10;

           reverseNumber=reverseNumber*10+digit;
           number=number/10;

        }
        System.out.println("reverseNumber = " + reverseNumber);
    }
}
