package days39_WrappersClass2;

public class ParsingToString {

    public static void main(String[] args) {

        Integer num = Integer.valueOf(1234);
        String str = String.valueOf(num);

        int num2 = 454;
        String str2 = String.valueOf(num2);

        num = num2 + 1;
        str = str + 2;

        System.out.println("num = " + num);
        System.out.println("str = " + str);

        Integer num3 = 234;
        String num4 = Integer.toString(num3);

        num3 = num3 + 5;
        num4 = num4 + 5;

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);


    }
}
