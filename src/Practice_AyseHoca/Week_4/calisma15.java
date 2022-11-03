package Practice_AyseHoca.Week_4;

public class calisma15 {

    public static void main(String[] args) {

        /*
       Ödev:   -string kabul eden bir method yazın,string olarak tarih ve saat gönderin
                - method gönderilen stringteki rakamlar dışındaki bütün karakterleri
               - string method larını kullanarak kaldırsın
               -ör:timeDate("10/05/2022 17:09:89") --->10052022170989 dönsün
         */

        time("10/05/2022", "17:09:89");

    }
    public static void time(String date,String time){

        String result = date.concat(time);
        System.out.println(result.replace("/", "").replace(" ", "").replace(":", ""));

    }


}
