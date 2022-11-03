package Days17_Review;

public class Task_Dividable {
    public static void main(String[] args) {

        int num = 36;
        if (num % 2 == 0) {
            System.out.println("sayi ikiye bolunuyor");
        }
        if (num % 3 == 0) {
            System.out.println("sayi 3 bolunebilir");
        }
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("sayi 6 ya bolunebilir");
        } else {
            System.out.println(" siradan sayi");
        }

        // Write a program that checks if number is dividable to 2,3,6

        int number = 60;

        if(number%2==0){
            //System.out.println("Number can be dived 2");
            if(number%3==0){
                System.out.println("Number can be divided 2,3,6");
            }else{
                System.out.println("Number can not be divided 3 and 6");
            }
        }else{
            System.out.println("Number can not be divided 2");
        }

        System.out.println("////////////////");

        if(number%2==0 && number%3==0){
            System.out.println("Number can be divided 2,3,6");
        }

        System.out.println("////////////////");

        System.out.println("Number can be divided 2,3,6 " + (number%2==0 && number%3==0));

        System.out.println("////////////////");

        System.out.println("Number can be divided 2,3,6 " + (number%6==0));





    }
}
