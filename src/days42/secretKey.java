package days42;

public class secretKey {

    public static void main(String[] args) {

        findSecretKey("Bazen", "kederler", "sessiz", "degisiklik", "yapmk", "kismetsizliginde", "islanmak", "istemezsler");


    }

    public static void findSecretKey(String... str) {

        String yeniStr = "";

        for (int i = 0; i < str.length; i++) {

            yeniStr = yeniStr + str[i].charAt(i);
        }

        System.out.println("Sampiyon " + yeniStr);
    }


}
