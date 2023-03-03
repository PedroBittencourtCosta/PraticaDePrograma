package matrizes;

public class testete {
    public static void main(String[] args) {

        int m[][] = new int[3][3];
        int n = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; i++) {
                m[i][j] = n++;
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; i++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
