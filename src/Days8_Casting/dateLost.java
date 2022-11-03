package Days8_Casting;

public class dateLost {
    public static void main(String[] args) {

        byte b;
        int i = 257;
        double d = 323.48;
        /// b % 256
        b = (byte) i;
        System.out.println("int degeri " + i + " byte degeri " + b);


        //// b % 256 =67 Explicitcasting
        b = (byte) d;

        System.out.println("double degeri "+d+" byte degeri "+b);


    }


}
