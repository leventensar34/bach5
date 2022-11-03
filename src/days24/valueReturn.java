package days24;

public class valueReturn {

    public static void main(String[] args) {

        System.out.println(sum(5,10));

       int result= sum(25,10);
        System.out.println(result);

        // degiskenin data type ile methodun dondurdugu deger uyumlu olmali
       // short result1=sum(25,15);

    }
    public static int sum(int num1,int num2){

      int result=num1+num2;

        return result;


    }






}
