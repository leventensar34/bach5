package days37;

public class StringContains {

    public static void main(String[] args) {
    /// Bir String degerinin bir yerde mevcut olup olmadigini kontrol etmek icin contains kullanilir

        String email="test@gmail.com";

        System.out.println(email.contains("@"));

        System.out.println("-----------");

        String liste="domates,patates,sogan,muz,ekmek,yogurt";

        if (liste.contains("ekmek")){
            System.out.println("Aradiginiz urun listede mevcut.");
        }else{
            System.out.println("Aradiginiz urun listede mevcut degil.");
        }


        boolean muzVarmi= liste.contains("muz");
        boolean pirincVarmi=liste.contains("pirinc");

        System.out.println("Listemde muz var mi? "+muzVarmi);

        System.out.println("Listemde pirinc var mi? "+pirincVarmi);

    }
}
