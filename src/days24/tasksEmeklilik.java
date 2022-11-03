package days24;

public class tasksEmeklilik {

    public static void main(String[] args) {

        retirement("Ahmet", 1945);

        retirement("Mehmet", 1990);

    }

    public static void retirement(String name, int birthday) {
        int age = 2022 - birthday;

        if (age > 65) {
            System.out.println("Hi " + name + " You can get tired ");
        } else {
            System.out.println("Hi " + name + " You can not get tired");
        }

    }


}
