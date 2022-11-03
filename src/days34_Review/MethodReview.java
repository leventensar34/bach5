package days34_Review;

public class MethodReview {

    public static void main(String[] args) {

        String myStr = " Hello ";
        char result = myStr.charAt(0);
        System.out.println("result = " + result);
        System.out.println("myStr.length() = " + myStr.length());

        System.out.println("-------------");
        System.out.println("myStr.trim().length() = " + myStr.trim().length());

        System.out.println(myStr);
        myStr = myStr.trim();
        System.out.println("Trim...: " + myStr + " lenght " + myStr.length());

        System.out.println("----------------");

        String firstName="Jhon ";
        String lastName="Doe";

        System.out.println("firstName.contains(lastName) = " + firstName.contains(lastName));

        System.out.println(firstName+lastName);

        System.out.println("---contains---"); //Bir seyin var olup olmadigini kontrol etmek icin kullanilir

        String myStr1="Hello";
        System.out.println("myStr1.contains(\"Hel\") = " + myStr1.contains("Hel"));
        System.out.println(myStr1.contains("Hi"));
        System.out.println("myStr1.toUpperCase().contains(\"HEL\") = " + myStr1.toUpperCase().contains("HEL"));

        System.out.println("---indexOf---");

        System.out.println("myStr1.indexOf(\"el\") = " + myStr1.indexOf("el"));

        System.out.println("---replace()---");

        String myStr3="Site is eurotechstudy.com";
        System.out.println("myStr3.replace(\"com\",\"net\") = " + myStr3.replace("com", "net"));


    }
}
