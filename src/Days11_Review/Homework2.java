package Days11_Review;

public class Homework2 {

    public static void main(String[] args) {
     /*
        int a=5;
        int p= ++a+ --a+ a++ +a--;
        System.out.println(p); */

        int a=5;
        int p;

        int result1=++a;
        System.out.println("a = " + a);

        int result2= --a;
        System.out.println("a = " + a);

        int result3= a++;
        System.out.println("a = " + a);

        int result4=a--;
        System.out.println("a = " + a);

        p=result1+result2+result3+result4;

        System.out.println("p = " + p);

    }

}
