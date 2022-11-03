package Days17_Review;

public class task_Switch {

    public static void main(String[] args) {

        String capital = "London";
        String contry = "";
        switch (capital) {
            case "London":
                contry = "England";
                break;
            case "Paris":
                contry = "France";
                break;
            case "Berlin":
                contry = "Germany";
                break;
            case "Ankara":
                contry = "Turkey";
                break;
            default:
                contry = "Unknown";
        }
        System.out.println(capital + " is capital of " + contry);
    }
}
