package days35_Arrays2;

public class AddingFruitsArray {

    public static class BenimVeriTipim {

        int sayi;
        String firstName;
        String lastName;
        boolean isMarried;
        int dateBirthYear;


    }

    public static void main(String[] args) {


        String[] meyvelerYaz = new String[3];
        String[] meyvelerKis = new String[3];

        int[] sayilar = new int[3];

        BenimVeriTipim[] benimVerim = new BenimVeriTipim[2];

        benimVerim[0] = new BenimVeriTipim();
        benimVerim[0].firstName = "Ahmet";
        benimVerim[0].lastName = "Falanca";
        benimVerim[0].isMarried = true;
        benimVerim[0].dateBirthYear = 2005;

        benimVerim[1] = new BenimVeriTipim();
        benimVerim[1].firstName = "Mehmet";
        benimVerim[1].lastName = "Can";
        benimVerim[1].isMarried = false;
        benimVerim[1].dateBirthYear = 2010;


        sayilar[0] = 1;
        sayilar[1] = 5;
        sayilar[2] = 45;


        meyvelerYaz[0] = "Elma";
        meyvelerYaz[1] = "Kavun";
        meyvelerYaz[2] = "Mango";

        String kisMeyve1 = "Portakal";
        String kisMeyve2 = "Mandalina";
        String kisMeyve3 = "Nar";

        meyvelerKis[0] = kisMeyve1;
        meyvelerKis[1] = kisMeyve2;
        meyvelerKis[2] = kisMeyve3;

        System.out.println("Yaz meyveler");
        for (int i = 0; i < meyvelerYaz.length; i++) {

            System.out.println(meyvelerYaz[i]);

        }
        System.out.println("Kis meyveler");
        for (int j = 0; j < meyvelerKis.length; j++) {

            System.out.println(meyvelerKis[j]);

        }
        System.out.println();
        System.out.println("Benim veri Tipim");
        benimVeriGoster(benimVerim);

    }


    public static void benimVeriGoster(BenimVeriTipim[] benimV){

        for (int i = 0; i < benimV.length ; i++) {

            System.out.println(benimV[i].firstName);
            System.out.println(benimV[i].lastName);
            System.out.println(benimV[i].isMarried);
            System.out.println(benimV[i].dateBirthYear);


        }


    }
}
