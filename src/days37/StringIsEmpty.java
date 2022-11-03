package days37;

public class StringIsEmpty {

    public static void main(String[] args) {


        String userName="";
        String password="1234";

        if (userName.isEmpty()){
            System.out.println("Username bos olamaz");
        }else {
            System.out.println("Username bos degil");
        }
        if (userName.isEmpty()||password.isEmpty()){
            System.out.println("username ve password bos olamaz");
        }else {
            System.out.println("username ve password bos degil");
        }


    }
}
