package matrizes;

import java.util.Random;

public class teste01 {
    public static void main(String[] args) {
        Random gr = new Random();

        int m[][] = new int[8][8];
        int mT[][] = new int[8][8];
        int contador = 0;

        // adicionei valores na matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = gr.nextInt(0, 10);
            }

        }

        // fiz a transposta da matriz
        for (int j = 0; j < mT.length; j++) {
            for (int i = 0; i < mT[j].length; i++) {
                mT[j][i] = m[i][j];
            }

        }

        // comparando as duas para ver se são simetricas
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == mT[j][i]) {
                    contador++;
                }
            }
        }

        // pribtei elas
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < mT.length; i++) {
            for (int j = 0; j < mT[i].length; j++) {
                System.out.print(mT[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println(contador);

        if (contador == 64) {
            System.out.println("A matriz é simetrica");
        } else {
            System.out.println("A matriz não é simetrica");
        }
    }
}
