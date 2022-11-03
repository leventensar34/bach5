package days32;

public class Bellek {

    public static void main(String[] args) {

        // steak ve heap diye 2 bolumden olusur. Heap, nesnelerin ve objectlerin tahsisi icin tasarlanmis
        // buyuk bir bellek alanidir.
        // Steak, primitive tiplerin depolandigi yerdir

        int a = 10;
        Insan omer = new Insan();
        String kelime = new String("hallo");
        //steak          //heap(yigin)

        // daha once hafizada kaydedilmis bir sey varsa ikinci bir defa kaydetmez onu kullanir.
        String s = "test";
        String s2 = "test";
        System.out.println(s == s2);
        String s3 = "test";
        System.out.println(s == s3);

        String kelime1=new String("test");
        System.out.println(s3==kelime1);


    }

}
