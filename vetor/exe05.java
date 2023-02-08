package vetor;

//Escreva um programa em Java que cria um vetor de 6 elementos entre 0 e 10, armazene os números inteiros digitados pelo usuário. Em seguida, verifique se um número digitado pelo usuário está presente no vetor e imprima na tela "O número está presente no vetor" ou "O número não está presente no vetor".

import java.util.Scanner;
import java.util.Random;

public class exe05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random gr = new Random();

        boolean presente = false;
        int num = 0;
        int meuVetor[] = new int[6];

        for (int i = 0; i < meuVetor.length; i++) {

            meuVetor[i] = gr.nextInt(0, 11);
            System.out.println(meuVetor[i]);
        }

        System.out.println("Digite um numero:");
        num = sc.nextInt();

        for (int i = 0; i < 6; i++) {

            if (num == meuVetor[i]) {
                presente = true;
                break;
            }
        }

        if (presente == true) {

            System.out.println("O número está presente no vetor");

        } else {
            System.out.println("O número não está presente no vetor");
        }
        sc.close();
    }
}
