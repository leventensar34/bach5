package Extra_Grup1_Calisma.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        // varArgs-->variable lenght argument
        //Not: varArg ile bir argumentin icine sinirsiz sayida eleman gonderebiliriz
        //   ... ile yapilir
        int[] ar = {5, 7, 9, 10};
        toplam(ar);
        System.out.println("-------------");
        toplam(5, 7, 9, 10,25,45,89);

        System.out.println("///////////");
        int[] arr = {5, 7, 20, 10};
        toplam2(arr);
        System.out.println("//////////////");

concat("efsane","serhat","erkan","rimel","adnan","sema");

    }

    public static void toplam(int... numbers) {
        int toplam = 0;
        for (int number : numbers) {
            toplam = toplam + number;
        }
        System.out.println(toplam);
    }

    public static void toplam2(int[] numbers) {
        int toplam = 0;
        for (int i = 0; i < numbers.length; i++) {
            toplam = toplam + numbers[i];
        }
        System.out.println(toplam);

    }

    public static void concat(String... str) {
        String newStr = "";
        for (String s : str) {
            newStr = newStr + s.charAt(1); // her elemanin 1. index ini bos stringin icine at
        }
        System.out.println(newStr);
    }


}
