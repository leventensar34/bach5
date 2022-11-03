package Days14_SwitchCase;

public class SwitchCaseHomeworkTasks {
    public static void main(String[] args) {
        /// task 1:
        char color = 'G';
        switch (color) {
            case 'R':
            case 'r':
                System.out.println("Red");
                break;
            case 'A':
            case 'a':
                System.out.println("Amber");
                break;
            case 'G':
            case 'g':
                System.out.println("Green");
                break;
            default:
                System.out.println("Do not have color");
        }
        System.out.println("-----------------");

        ///// task 2:
        int level = 2;
        String score = "";
        switch (level) {
            case 1:
                score = "Beginner";
                break;
            case 2:
                score = "Elementry";
                break;
            case 3:
                score = "Intermediate";
                break;
            case 4:
                score = "Advance";
                break;
            case 5:
                score = "Expert";
                break;
            default:
                score = "Do not have level";
        }
        System.out.println("score = " + score);

        System.out.println("-----------------");
        ////// task 3:

        String marka = "Mercedes";
        String not = "";

        switch (marka) {
            case "Mercedes":
                not = "Good one";
                break;
            case "Volvo":
                not = "Tought one";
                break;
            case "Opel":
                not = "Not bad";
                break;
            case "Sahin":
                not = "Not recommended";
                break;
            default:
                not = "Do not buy one";
        }
        System.out.println(marka + " is " + not);

        System.out.println("------------------------");
        ///// task 4:
        int num = 6;
        String month = "";
        switch (num) {
            case 1:
                month = "Ocak";
                break;
            case 2:
                month = "Subat";
                break;
            case 3:
                month = "Mart";
                break;
            case 4:
                month = "Nisan";
                break;
            case 5:
                month = "Mayis";
                break;
            case 6:
                month = "Haziran";
                break;
            case 7:
                month = "Temmuz";
                break;
            case 8:
                month = "Agustos";
                break;
            case 9:
                month = "Eylul";
                break;
            case 10:
                month = "Ekim";
                break;
            case 11:
                month = "Kasim";
                break;
            case 12:
                month = "Aralik";
                break;
            default:
                month = "Gecersiz bir sayi girdiniz!!";

        }
        System.out.println("month = " + month);
    }
}
