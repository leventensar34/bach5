package days39;

public class Review_Arrays {

    public static void main(String[] args) {

        int[] sayilar={14,24,44,76};
        System.out.println("sayilar[0] = " + sayilar[0]);

        int[] rakamlar=new int[4];
        System.out.println("rakamlar[0] = " + rakamlar[0]); // int oldugu icin 0 doner.


        String[] siseler=new String[4];

        System.out.println("siseler[0] = " + siseler[0]); // String oldugu icin null doner.

        siseler[0]="Gazoz";
        siseler[1]="Limonata";
        siseler[2]="Ayran";
        siseler[3]="Salgam";

       // for Each Loop - iter

        for (String s : siseler) {
            System.out.println(s);
        }


        // For Loop - itar
        for (int i = 0; i < siseler.length; i++) {
            String s = siseler[i];

        }
        //  NOT:
        // "" empty
        // "  " whitespace
        // null != empty  !!!



    }
}
