package days38;

public class ForEachLoop {

    public static void main(String[] args) {


        int[] numaralar = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("numaralar[0] = " + numaralar[0]);

        for (int numara:numaralar) {

            System.out.println(numara);
        }
            System.out.println("-----------------");

            /// 2. yol for loop la da yapilabilir

            for (int i = 0; i <numaralar.length; i++) {

                System.out.print(" "+numaralar[i]);
            }

        }


    }

