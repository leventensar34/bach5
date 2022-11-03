package days35_Arrays2;

public class TelRehber {

    public static class Person {

        String firstName;
        String lastName;
        int phone;


        public static void telListe(Person[] liste) {

            System.out.println("Rehberimdeki kisileri liste halinde ekrana yazar.");


        }

        public static void findByName(Person[] liste, String kisi) {

            System.out.println("Isimden arama yapar.Buldugu sonucu ekrana yazar.");

            System.out.println("FirstName\tLastName\tPhone");
            System.out.println("---------\t--------\t-----");
            for (int i = 0; i < liste.length; i++) {

                if (liste[i] == null) {
                    continue;
                }
                System.out.println(liste[i].firstName+"\t");
                System.out.println(liste[i].lastName);
                System.out.println(liste[i].phone);
            }



        }

        public static void findByLastName(Person[] liste, String kisi) {


            System.out.println("Isimden arama yapar.Buldugu sonucu ekrana yazar.");
        }

    }

    public static void main(String[] args) {

        Person[] rehberim = new Person[10];
        rehberim[0] = new Person();

        rehberim[0].firstName = "Mustafa";
        rehberim[0].lastName = "Can";
        rehberim[0].phone = 509456;

        rehberim[1] = new Person();
        rehberim[1].firstName = "Jhon";
        rehberim[1].lastName = "Smith";
        rehberim[1].phone = 456456;

         rehberim[2] = new Person();
        rehberim[2].firstName = "Mustafa";
        rehberim[2].lastName = "";
        rehberim[2].phone = 456456;







        Person.findByName(rehberim, "Deneme");

    }

}
