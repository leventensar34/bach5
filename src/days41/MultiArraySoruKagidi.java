package days41;

public class MultiArraySoruKagidi {

    public static void main(String[] args) {


        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        };
        // KEY TO THE QUESTIONS

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};


        for (int i = 0; i < answers.length; i++) {

            int dogruCevapSayisi = 0;

            for (int j = 0; j < answers[i].length; j++) {

                if (answers[i][j] == keys[j]) {

                    dogruCevapSayisi++;
                }

            }
            System.out.println((i + 1) + ". ogrencinin dogru cevap sayisi: " + dogruCevapSayisi);

        }
    }
}


