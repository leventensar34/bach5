package Practice_AyseHoca.Week_2;

public class calisma10 {

    public static void main(String[] args) {

        double[] dizi={16.3,7.5,78.6};

        System.out.println(alem(dizi));
    }
   public static double alem(double[] nums){
       double ort=0.0;
       int sum=0;
       for (int i = 0; i < nums.length; i++) {
           sum+=nums[i];
       }
       ort=sum/nums.length;
      return ort;
   }
}
