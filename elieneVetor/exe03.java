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
        int maior = 0, posiMaior = 0, posiMenor = 0, menor = 0, conf = 0;

        for (int i = 0; i < vetorN.length; i++) {
            System.out.println("insira os numeros do seu vetor:");
            vetorN[i] = sc.nextInt();

            if (maior < vetorN[i]) {
                maior = vetorN[i];
                posiMaior = i;
            }

            conf = vetorN[i];

            if (menor < vetorN[i]) { // tem q arrumar essa poha.
                menor = vetorN[i];
                posiMenor = i;
            }
        }

        System.out.println("O seu vetor ai:");

        for (int i = 0; i < vetorN.length; i++) {
            System.out.println(vetorN[i]);
        }

        System.out.printf("O maior valor do vetor é: %d e está na %d posição.", maior, posiMaior);
        System.out.printf("O menor valor do vetor é: %d e está na %d posição.", menor, posiMenor);

        sc.close();

    }
}
