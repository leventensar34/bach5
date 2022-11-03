package days68;

import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {

        ArrayList<String>isimler=new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ayse");

        ArrayList adlar=new ArrayList<>();  // Boylede tanimlanabilir. Ama dogru olani yukarda icerde data typeini belirlemek.
        adlar.add(3);
        adlar.add("Ali");


    }
}
