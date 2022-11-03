package days52;

public class PassingObject {

    public static void main(String[] args) {

        SDET mustafaBey = new SDET("Mustafa", 30, 'M', "Airbus", 120000, true);

        System.out.println("mustafaBey.salary = " + mustafaBey.salary);
        SDET oykuHanim = new SDET("Oyku", 30, 'F', "Boeing", 130000, true);

        System.out.println("oykuHanim.salary = " + oykuHanim.salary);

        vergiKesimi(oykuHanim);
        System.out.println("oykuHanim.salary = " + oykuHanim.salary);

    }


    /// Parsing Object !!!!!!!!
    public static void vergiKesimi(SDET personel) {

        if (personel.salary > 120000) {
            personel.salary -= 30000;
        } else {
            personel.salary -= 20000;
        }
    }

}
