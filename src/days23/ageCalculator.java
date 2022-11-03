package days23;

public class ageCalculator {

    public static void main(String[] args) {
        ageCalculator("Ahmet",2021, 1980);
        ageCalculator("Ali",2030,1976);

    // siralama cok onemli!!!!! Asagida tanimlanan sira ile ayni olmali

    }

    public static void ageCalculator(String name,int currentYear, int birthYear) {

      int age = currentYear - birthYear;
        System.out.println(name+" is " + age + " years old");


    }


}
