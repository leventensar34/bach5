package days35_Arrays2;

import java.util.Scanner;

public class ArrayQuiz {

    public static class Quiz {

        String question;
        String answer;


    }

    public static void main(String[] args) {

        String quiz1 = "What is the capital of Turkey?\n" +
                "(a) Konya\n" +
                "(b) Istanbul\n" +
                "(c) Urfa\n" +
                "(d) Ankara\n";


        String quiz2 = "What is the largest(population) city of Turkey?\n" +
                "(a) Adiyaman\n" +
                "(b) Istanbul\n" +
                "(c) G.Antep\n" +
                "(d) Ankara\n";

        Quiz[] question = new Quiz[2];

        question[0] = new Quiz();
        question[0].question = quiz1;
        question[0].answer = "d";

        question[1] = new Quiz();
        question[1].question = quiz2;
        question[1].answer = "b";


        quizCoz(question);


    }

    public static void quizCoz(Quiz[] questions) {

        int dogruCevapSay = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i].question);

            System.out.println("Your answer is ...:");
            String yourAnswer = scan.nextLine();

            if (yourAnswer.equals(questions[i].answer)) {
                dogruCevapSay++;

            }
        }
        System.out.println();
        System.out.println("Your number of cerrect answer is...: " + dogruCevapSay + "/" + questions.length);
    }
}
