package matrizes;

//Crie uma matriz contendo 5 linhas e 5 colunas, preencha de acordo com informações passados pelo usuário e imprima os valores

import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m[][] = new int[5][5];

        System.out.println("Insira os dados da sua matriz: ");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
