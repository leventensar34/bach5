package days36_MultiDimensionalArrays;

public class Homework_Ek {

    public static void main(String[] args) {
        int Student[][] = {{80, 80, 80, 50},
                {20, 40, 60, 80},
                {23, 23, 22, 76},
                {50, 45, 37, 82},
                {60, 60, 60, 20}};

        String[] sinav = {"Vize", "Vize", "Vize", "Final"};

        for (int i = 0; i < Student.length; i++) {
            double notort = 0;
            double not;
            for (int j = 0; j < Student[i].length; j++) {
                not = Student[i][j];
                System.out.println((i + 1) + ". ogrencinin " + sinav[j] + " notu: " + not);
                if (j < Student[i].length - 1) {
                    notort += not;
                } else {
                    notort = (notort / (Student[i].length - 1) * 0.4) + (not * 0.6);
                }
            }
            System.out.println("\n" + (i + 1) + ". Ogrencinin Not Ortalamasi : " + notort);
            System.out.println("-----------------------------");
        }
    }
}
