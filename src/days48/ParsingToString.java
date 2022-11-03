package days48;

public class ParsingToString {

    public static void main(String[] args) {

        Integer num = Integer.valueOf(1234);
        String num2 = String.valueOf(num);

        int num5=454;
        String str=String.valueOf(num5);
        System.out.println(num5);

        num = num + 1;
        num2 = num2 + 1;

        System.out.println(num);
        System.out.println(num2);


        Integer num3 = 234;
        String num4 = Integer.toString(num3);

        num3 = num3 + 5;
        num4 = num4 + 5;

        System.out.println(num3);
        System.out.println(num4);


    }
}
