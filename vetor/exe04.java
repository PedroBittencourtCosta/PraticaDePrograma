package vetor;

// Escreve em Java um programa que tenha um vetor de 10 posições do tipo inteiro, preenche esse vetor com valores aleatorios entre 0 e 100. Ao final, mostre na tela todos os valores que foram armazenados no vetor e qual foi o maior valor gerado.

import java.util.Random;

public class exe04 {
    public static void main(String[] args) {

        Random gr = new Random();

        int aux = 0;
        int numeros[] = new int[10];

        for (int i = 0; i < 10; i++) {

            int num = gr.nextInt(1, 101);

            if (aux < num) {
                aux = num;
            }

            if (i == 0) {

                numeros[0] = num;

            } else if (i == 1) {

                numeros[1] = num;

            } else if (i == 2) {

                numeros[2] = num;

            } else if (i == 3) {

                numeros[3] = num;

            } else if (i == 4) {

                numeros[4] = num;

            } else if (i == 5) {

                numeros[5] = num;

            } else if (i == 6) {

                numeros[6] = num;

            } else if (i == 7) {

                numeros[7] = num;

            } else if (i == 8) {

                numeros[8] = num;

            } else if (i == 9) {

                numeros[9] = num;

            }

        }

        System.out.printf("Os numeros gerados: %d - %d - %d - %d - %d - %d - %d - %d - %d - %d\n", numeros[0],
                numeros[1], numeros[2], numeros[3], numeros[4], numeros[5], numeros[6], numeros[7], numeros[8],
                numeros[9]);
        System.out.printf("O maior numero é: %d\n", aux);

    }
}
