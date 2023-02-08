package vetor;

//Escreva um programa em Java que cria um vetor de 6 elementos entre 0 e 10, armazene os números inteiros digitados pelo usuário. Em seguida, verifique se um número digitado pelo usuário está presente no vetor e imprima na tela "O número está presente no vetor" ou "O número não está presente no vetor".

import java.util.Scanner;
import java.util.Random;

public class exe05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random gr = new Random();

        int meuVetor[] = new int[6];

        for (int i = 0; i < 6; i++) {

            int valor = gr.nextInt(1, 6);

            if (i == 0) {

                meuVetor[0] = valor;

            } else if (i == 1) {

                meuVetor[1] = valor;

            } else if (i == 2) {

                meuVetor[2] = valor;

            } else if (i == 3) {

                meuVetor[3] = valor;

            } else if (i == 4) {

                meuVetor[4] = valor;

            } else if (i == 5) {

                meuVetor[5] = valor;

            }
        }

        sc.close();
    }
}
