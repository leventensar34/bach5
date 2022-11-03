package days39_WrappersClass2;

public class Task3 {

    public static void main(String[] args) {

        /*
       Write a method that can recognise numbers in following Strings and print them as digits
String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$”;
String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
Ex: updateToDigits(String s)
Returns:
- 1 2 5 6
- 9 3 4
         */

        String str1= "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";

        System.out.println(updateToDigits(str1));
        System.out.println(updateToDigits(str2));


    }

    public static String updateToDigits(String s) {

        String newStr = "";
        for (int i = 0; i < s.length(); i++) {

            if (Character.isAlphabetic(s.charAt(i))) {
                newStr = newStr + s.charAt(i);
            }

        }

        return newStr;
    }
}
