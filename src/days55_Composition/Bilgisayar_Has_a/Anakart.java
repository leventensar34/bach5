package days55_Composition.Bilgisayar_Has_a;

public class Anakart {

   private String model;
    private String uretici;
    private int ramSlot;
    private int cardSlod;
    private String bios;

    public Anakart(String model, String uretici, int ramSlot, int cardSlod, String bios) {
        this.model = model;
        this.uretici = uretici;
        this.ramSlot = ramSlot;
        this.cardSlod = cardSlod;
        this.bios = bios;
    }
    public void programYukle(  String programIsmi){
        System.out.println(programIsmi+" isimli program yukleniyor");
    }

    public String getModel() {
        return model;
    }

    public String getUretici() {
        return uretici;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlod() {
        return cardSlod;
    }

    public String getBios() {
        return bios;
    }
}
