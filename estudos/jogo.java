package estudos;

import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    public static void jagada(int n01, int n02, int num) {

        int m[][] = new int[3][3];

        m[n01][n02] = num;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = 0;
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
