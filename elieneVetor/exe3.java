package elieneVetor;

// 3 - Crie um programa em Java, contendo um vetor de tamanho o tamanho especificado pelo usuário, preencha o vetor com os valores informador pelo usuário. Imprima o valor máximo e o valor mínimo do vetor.

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, maior = 0, menor = 0;

        System.out.println("Informe o tamanho do seu vetor:");
        n = sc.nextInt();

        int vetor[] = new int[n];
        System.out.println("Insira os valores");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {

            if (maior < vetor[i]) {
                maior = vetor[i];
            }

            if (menor > vetor[i]) {
                menor = vetor[i];
            }
        }

        System.out.printf("O valor maximo: %d\n", maior);
        System.out.printf("O valor minimo: %d\n", menor);

        sc.close();
    }
}
