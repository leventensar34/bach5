package days32;

public class Pasta {
    String pasta = "cikolatali Pasta";
    static int dilim = 20; // statik olunca  classa ait variable olur
    int kisiselPastaDilimi; // statik olmadigi icin objeye ait variable olur


    public void pastaYe() {
        dilim--;

    }

    public void pastaYediKisisel() {
        kisiselPastaDilimi--;
    }

    public static void main(String[] args) {

        Pasta cocuk = new Pasta();
        System.out.println("dilim = " + dilim);
        cocuk.pastaYe(); // ortak pasta yedi

        Pasta baba = new Pasta();
        baba.pastaYe(); //ortak pasta yedi
        System.out.println("dilim = " + dilim);

        cocuk.kisiselPastaDilimi = 5;
        System.out.println("cocuk.kisiselPastaDilimi = " + cocuk.kisiselPastaDilimi);
        cocuk.pastaYediKisisel(); // kendi pasta payini yiyiyor
        System.out.println("cocuk.kisiselPastaDilimi = " + cocuk.kisiselPastaDilimi);
        System.out.println("baba.kisiselPastaDilimi = " + baba.kisiselPastaDilimi);
        baba.kisiselPastaDilimi = 100;
        baba.pastaYe();
        System.out.println("dilim = " + dilim); // ortak
        baba.pastaYediKisisel();
        System.out.println("baba.kisiselPastaDilimi = " + baba.kisiselPastaDilimi);

        Pasta abla = new Pasta();
        System.out.println("abla.kisiselPastaDilimi = " + abla.kisiselPastaDilimi);
        abla.pastaYe();
        System.out.println("dilim = " + dilim);


    }


}
