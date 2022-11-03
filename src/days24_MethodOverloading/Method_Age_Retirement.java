package days24_MethodOverloading;

public class Method_Age_Retirement {

    public static void main(String[] args) {

        ageCalculator("Ali", 2022, 1990);
        retirement("Ali", 1990);


    }

    public static void ageCalculator(String name, int currentYear, int birthYear) {

        int age = currentYear - birthYear;
        System.out.println(name + " is " + age + " years old");

    }

    public static void retirement(String name, int birthday) {
        int age = 2022 - birthday;

        if (age > 65) {
            System.out.println("Hi " + name + " You can get tired ");
        } else {
            System.out.println("Hi " + name + " You can not get tired, You need " + (65 - age) + " years to retirement");
        }


    }
}
