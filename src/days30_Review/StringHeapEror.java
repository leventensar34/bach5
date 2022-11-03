package days30_Review;

public class StringHeapEror {

    public static void main(String[] args) {

        System.out.println("Heap out of memory");
        String a = new String();

        a="Deneme heap";

        for (int i = 0; i < 1_000_000_000; i++) {

            System.out.println("i = " + i);
            System.out.print(a=a+a);


        }

    }
}
