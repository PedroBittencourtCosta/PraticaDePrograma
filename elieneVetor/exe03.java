package elieneVetor;

//Faça um programa que leia um vetor N[6]. A seguir, encontre
//o maior e o menor valor, mostrando: “O maior valor do vetor é
//... e está na ... posição. O menor valor do vetor é ... e está na ...
//posição.”

import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetorN[] = new int[6];
        int posiMaior = 0, posiMenor = 0;

        System.out.println("insira os numeros do seu vetor:");
        for (int i = 0; i < vetorN.length; i++) {
            vetorN[i] = sc.nextInt();

        }

        System.out.println("O seu vetor ai:");

        int maior = vetorN[0], menor = vetorN[0];

        for (int i = 0; i < vetorN.length; i++) {

            if (vetorN[i] > maior) {
                maior = vetorN[i];
                posiMaior = i + 1;
            }

            if (vetorN[i] < menor) {
                menor = vetorN[i];
                posiMenor = i + 1;
            }
            System.out.println(vetorN[i]);
        }

        System.out.printf("O maior valor do vetor é: %d e está na %d posição.",
                maior, posiMaior);
        System.out.printf("O menor valor do vetor é: %d e está na %d posição.", menor, posiMenor);

        sc.close();

    }
}
