package days38;

public class Arrays2 {

    public static void main(String[] args) {

        String[] sehirler = new String[4];

        sehirler[0] = "Izmir";
        sehirler[1] = "Denizli";
        sehirler[2] = "Bursa";
        sehirler[3] = "Istanbul";


        System.out.println(sehirler[0]);
        System.out.println(sehirler[1]);
        System.out.println(sehirler[2]);
        System.out.println(sehirler[3]);

        System.out.println("-------------");


        /// 2. yol

        int[] tarihler = {2000, 2001, 2002, 2003, 2004}; // index numaralari sira ile gider
                         //0    1      2    3      4
        System.out.println("tarihler[0] = " + tarihler[0]);

        int tarih = tarihler[3];


        String[] honda = {"accord", "jazz", "civic"};

        System.out.println("honda[1] = " + honda[1]);


        String[] baskentler = {"Ankara", "Berlin", "London", "Paris", "Atina"};

        System.out.println("baskentler[0] = " + baskentler[0]);
        baskentler[0] = "Madrid";
        System.out.println("baskentler[0] = " + baskentler[0]);

        System.out.println("baskentler[1].charAt(1) = " + baskentler[1].charAt(1));

        String isvec=baskentler[4];
        System.out.println(isvec);
        System.out.println("baskentler[2].contains(\"stok\") = " + baskentler[2].contains("stok"));



    }
}
