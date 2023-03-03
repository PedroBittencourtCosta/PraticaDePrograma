package elieneVetor;

import java.util.Random;
// Faça um programa que leia 2 vetores e armazene a soma deles
// em um 3º vetor.

public class exe04 {
    public static void main(String[] args) {

        Random gr = new Random();

        int vetA[] = new int[5];
        int vetB[] = new int[5];
        int vetC[] = new int[5];

        for (int i = 0; i < vetA.length; i++) {

            System.out.printf("vetor A: %d\n", vetA[i] = gr.nextInt(1, 101));
            for (int j = 0; j < i; j++) {
                while (vetA[j] == vetA[i]) {
                    vetA[i] = gr.nextInt(1, 101);
                }
            }
        }

        for (int i = 0; i < vetB.length; i++) {
            System.out.printf("vetor B: %d\n", vetB[i] = gr.nextInt(1, 101));
            for (int j = 0; j < i; j++) {
                while (vetB[j] == vetB[i]) {
                    vetB[i] = gr.nextInt(1, 101);
                }
            }
        }

        System.out.println("A soma dos dois vetores:");
        for (int i = 0; i < vetC.length; i++) {
            vetC[i] = vetA[i] + vetB[i];
            System.out.println(vetC[i]);
        }

    }
}
