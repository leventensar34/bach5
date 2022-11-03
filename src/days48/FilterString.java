package days48;

public class FilterString {

    public static void main(String[] args) {

        /// Stringi sonra yaz buraya
        // String str=?

    }

    public static String filterString(String s) {

        String str = "";
        for (int i = 0; i < s.length(); i++) {

            if (Character.isAlphabetic(s.charAt(i)) | s.charAt(i) == ' ') {
                str = str + s.charAt(i);
            }

        }
        return str;
    }
}
