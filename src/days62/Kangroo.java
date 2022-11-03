package days62;

public class Kangroo extends Marsupial {

    public  boolean isBiped() {
        return true;
    }




    public void getKangrooDescription(){
        System.out.println("Kangroo walks on the two legs : "+isBiped());
    }


}
