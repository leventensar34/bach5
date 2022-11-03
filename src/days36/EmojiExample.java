package days36;

public class EmojiExample {

    public static void main(String[] args) {

        String emoji = ":)";

        if (emoji.length()!=2){
            System.out.println("Invalid Emoji");
            return;
        }

        char firstChar=emoji.charAt(0);
        char secondChar= emoji.charAt(1);

        if (firstChar==':'){
            if (secondChar==')'){
                System.out.println("Smile");
            } else if (secondChar=='(') {
                System.out.println("Sad");
            } else if (secondChar=='/') {
                System.out.println("Upset");
            } else if (secondChar=='p') {
                System.out.println("Playful");
            }else{
                System.out.println("Unknown emoji");
            }

        } else if (firstChar==';') {
            if (secondChar==')'){
                System.out.println("Wink");
            } else if (secondChar=='@') {
                System.out.println("Surprised");
            }else {
                System.out.println("Unknown emoji");
            }
        }

    }
}
