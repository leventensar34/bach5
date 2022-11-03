package days34_Review;

public class RemoveDuplicates {

       /*Write a return method that can remove the duplicated values from string
        Ex: removeDuplicated("DDEECGDDEEEEFGGDCDD") ==> DECDF
        */
    public static String removeDuplicated(String inputText){
        String result = "";
        for (int i = 0; i < inputText.length(); i++) {
            if(!result.contains((inputText.charAt(i) + ""))) { //if(!result.contains(String.valueOf(inputText.charAt(i)))) //.contains(String)
                result += String.valueOf(inputText.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String strTest ="DDEECGDDEEEEFGGDCDD";

        String result = removeDuplicated(strTest); //Method call to removeDuplicated() and it returns the result

        System.out.println(result);

    }


}
