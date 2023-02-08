package vetor;

// Escreva um programa em Java que cria um vetor de 5 elementos e armazena nomes de frutas digitados pelo usuário. Em seguida, imprima o vetor na tela.

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String frutas[] = new String[5];
        String fruta = "";

        for (int i = 0; i < 5; i++) {

            System.out.println("Insira o nome de uma fruta:");
            fruta = in.nextLine();

            if (i == 0) {

                frutas[0] = fruta;

            } else if (i == 1) {

                frutas[1] = fruta;

            } else if (i == 2) {

                frutas[2] = fruta;

            } else if (i == 3) {

                frutas[3] = fruta;

            } else if (i == 4) {

                frutas[4] = fruta;
            }

        }

        System.out.printf("as frutas sao essas: %s, %s, %s, %s, %s", frutas[0], frutas[1], frutas[2], frutas[3],
                frutas[4]);

        in.close();
    }
}
