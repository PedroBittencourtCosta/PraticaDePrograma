package estudos;

import java.util.Random;
import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha = 0, coluna = 0;

        System.out.println("Determine o tamanho da matriz:");
        linha = sc.nextInt();
        coluna = sc.nextInt();

        criarmatriz(linha, coluna);

        sc.close();
    }

    public static void criarmatriz(int n01, int n02) {

        Random gr = new Random();

        int m[][] = new int[n01][n02];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = gr.nextInt(0, 10);
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
