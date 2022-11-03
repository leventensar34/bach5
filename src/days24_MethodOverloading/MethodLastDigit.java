package days24_MethodOverloading;

public class MethodLastDigit {

    public static void main(String[] args) {

        System.out.println(lastDigit(13,23));
        System.out.println(lastDigit(1000,99));

    }
    public static boolean lastDigit(int num1,int num2){

        if (num1%10==num2%10){
            return true;
        }else{
            return false;
        }


    }
}
