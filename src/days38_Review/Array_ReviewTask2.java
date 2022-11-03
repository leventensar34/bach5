package days38_Review;

public class Array_ReviewTask2 {

    public static void main(String[] args) {

        int[] x = {1, 2, 3};
        System.out.println(firstLastEqual(x));

        int[] y = {1, 2, 3, 1};
        String result = firstLastEqual(y);
        System.out.println(result);

        int[] z={1,2,1};
        System.out.println(firstLastEqual(z));

        Boolean b1=new Boolean(firstLastEqual(z));
        System.out.println("b1 = " + b1);


        int[] k={1};
        System.out.println(firstLastEqual(k));



    }

    public static String firstLastEqual(int[] arr) {

        if (!(arr.length > 1)) {
            return "not valid an array";
        }

        if (arr[0] == arr[arr.length - 1]) {
            return "true";
        } else {
            return "false";
        }
    }

}
