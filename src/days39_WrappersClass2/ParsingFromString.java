package days39_WrappersClass2;

public class ParsingFromString {
    public static void main(String[] args) {

        String stringNumber="2022";
        System.out.println(stringNumber);

        int number=Integer.parseInt(stringNumber);
        int  number2=Integer.valueOf(stringNumber);

        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);

        stringNumber=stringNumber+5;
        number=number2+5;


        Double number3 = Double.parseDouble(stringNumber);
        System.out.println(number3);

        // NumberFormatExeption (verilen hata turu: Yani verilen string int donusturebilir cinsten degil
        String s = "2022A";
        int number5 = Integer.parseInt(s);



    }
}
