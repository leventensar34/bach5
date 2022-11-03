package Days18_WhileLoop;

public class WhileLoop_Toplama {
    public static void main(String[] args) {


        int sum=0;
        int i=1;

        while (i<10){
            sum+=i; // i=1, sum=1 // sum=3  i=2//sum=6  i=3// sum=10  i=4// .......
            i++;
        }
        System.out.println("Sayilarin Toplami = " + sum);
    }
}
