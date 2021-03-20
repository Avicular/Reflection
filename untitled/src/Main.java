import java.time.Clock;

public class Main {

    public static void main(String[] args) {


        int m = 7;
        int n = 7;
        int[][] tab = new int[m][n];

        // reflection on the first diagonal

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i > j)
                    tab[i][j] = tab[j][i];
                else
                    tab[i][j] = (int) (Math.random() * 10);
                System.out.print(tab[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        // reflection on the second diagonal

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (j > (tab[i].length-(i+1)))
                    tab[i][j] = tab[((tab[i].length-1)-j)][(tab[i].length-1)-i];
                else
                    tab[i][j] = (int) (Math.random() * 10);
                System.out.print(tab[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

