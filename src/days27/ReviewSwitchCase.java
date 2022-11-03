package days27;

public class ReviewSwitchCase {

    public static void main(String[] args) {

        int rakam = 35;

        String plaka = "";

        switch (rakam) {

            case 3:
                plaka = "Afyon";
                break;
            case 20:
                plaka = "Denizli";
                break;
            case 35:
                plaka = "Izmir";
                break;
            default:
                plaka = "Bos";

        }
        System.out.println("plaka = " + plaka);

        switch (plaka){
            case "Afyon":
                rakam=3;
                break;
            case "Denizli":
                rakam=20;
                break;
            case "Izmir":
                rakam=35;
                break;
            default:
                rakam=0;

        }
        System.out.println("rakam = " + rakam);


    }
}
