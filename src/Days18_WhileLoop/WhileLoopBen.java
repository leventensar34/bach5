package Days18_WhileLoop;

public class WhileLoopBen {

    public static void main(String[] args) {
        /// 1
        int count=0;
        while (count<100){
            System.out.println("Welcome to java ");
            count++;
        }

        // 2
        int sum=0,i=1;
        while (i<10){
            sum+=i;
            i++;
            System.out.println("sum = " + sum);
        }

        // 3
        int a=0;
        while (a<10){
            if ((a++%2==0)){
                System.out.println(a);
            }
        }


    }
}
