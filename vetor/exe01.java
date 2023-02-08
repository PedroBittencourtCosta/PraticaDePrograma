package vetor;

// Escreva um programa em Java que cria um vetor de 10 elementos e armazena
// números inteiros digitados pelo usuário. Em seguida, imprima o vetor na tela.

import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int vetor[] = new int[10];
        int num = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("digite um numero qualquer:");
            num = in.nextInt();

            if (i == 0) {

                vetor[0] = num;

            } else if (i == 1) {

                vetor[1] = num;

            } else if (i == 2) {

                vetor[2] = num;

            } else if (i == 3) {

                vetor[3] = num;

            } else if (i == 4) {

                vetor[4] = num;

            } else if (i == 5) {

                vetor[5] = num;

            } else if (i == 6) {

                vetor[6] = num;

            } else if (i == 7) {

                vetor[7] = num;

            } else if (i == 8) {

                vetor[8] = num;

            } else if (i == 9) {

                vetor[9] = num;

            }
        }

        System.out.printf("Os numeros são: %d - %d - %d - %d - %d - %d - %d - %d - %d - %d", vetor[0], vetor[1],
                vetor[2], vetor[3], vetor[4], vetor[5], vetor[6], vetor[7], vetor[8], vetor[9]);

        in.close();

    }
}
