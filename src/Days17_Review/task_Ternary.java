package Days17_Review;

public class task_Ternary {
    public static void main(String[] args) {

        int num1=34;
        int num2=54;
        boolean result=(num1%10==num2%10)?true:false;
        System.out.println("result = " + result);

        System.out.println("-------------");
        //2. yol
        System.out.println("result = " +((num1%10==num2%10)?true:false));


    }
}
