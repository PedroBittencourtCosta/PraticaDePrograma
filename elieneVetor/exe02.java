package elieneVetor;

// Implementar um programa que, dado um vetor de n
// posições, de números inteiros, determine:
// Soma de todos os elementos;
// Soma dos elementos PARES;
// Soma dos elementos ÍMPARES;

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, soma = 0, somaPares = 0, somaImpares = 0;

        System.out.println("Determine o tamanho do seu vetor");
        n = sc.nextInt();
        int vetor[] = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira um numero:");
            vetor[i] = sc.nextInt();

            soma = soma + vetor[i];

            if (vetor[i] % 2 == 0) {
                somaPares = somaPares + vetor[i];
            } else {
                somaImpares = somaImpares + vetor[i];
            }
        }

        System.out.printf("o seu vetor:\n");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.printf("A soma de todos os elementos: %d\n", soma);
        System.out.printf("A soma de todos os elementos pares: %d\n", somaPares);
        System.out.printf("A soma de todos os elementos impares: %d\n", somaImpares);

        sc.close();
    }
}
