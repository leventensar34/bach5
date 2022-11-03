package days63;

import java.util.ArrayList;

public class HayvanCiftligi {

    ArrayList<Cat> kediler=new ArrayList<>();
    ArrayList<CobanKopegi> dogs=new ArrayList<>();


    public HayvanCiftligi(Cat cat,CobanKopegi kopek) {

        kediler.add(cat);
        dogs.add(kopek);
    }

    public void getList(int no){
        System.out.println(kediler.get(no));
        System.out.println(dogs.get(no));
    }



}
