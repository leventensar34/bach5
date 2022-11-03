package Days11_Review;

public class InterviewTasks {

    public static void main(String[] args) {
        // task 1:
     /*
        int a = 5;
        float b = a / 2;
        System.out.println("b = " + b); */

        ///// task 2:
   /*
        char ch='A'; // A=65
        int a=ch+1;
        ch=(char)a;
        System.out.println(ch); */

        //// task 3:
        /*
        float a = (float) 8.2 / 2;
        System.out.println(a); */

        /////
        int abc = 10;
        int xyz = 0;
        // abc++ postfix
        // ++abc prefix
        System.out.println("abc = " + abc);
        System.out.println("---------");

        xyz = abc++;

        System.out.println("abc = " + abc);
        System.out.println("xyz = " + xyz);
        System.out.println("--------");

        xyz = ++abc;
        System.out.println("abc = " + abc);
        System.out.println("xyz = " + xyz);
        System.out.println("-----------");

        xyz = abc--;
        System.out.println("abc = " + abc);
        System.out.println("xyz = " + xyz);
        System.out.println();

        xyz = --abc;
        System.out.println("abc = " + abc);
        System.out.println("xyz = " + xyz);

        System.out.println();
        xyz -= 5;
        System.out.println("xyz = " + xyz);

    }


}
