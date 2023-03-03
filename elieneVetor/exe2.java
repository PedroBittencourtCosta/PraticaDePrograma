package elieneVetor;

// 2 - Crie um programa em Java, contendo um vetor de tamanho o tamanho especificado pelo usuário, preencha o vetor com os valores informador pelo usuário. Após preencher o vetor, peça um valor específico e busque esse valor no vetor e imprima qual posição esse valor se encontra no vetor, ou informe que esse valor não existe caso não encontre.

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, valor = 0;
        boolean valida = false;

        System.out.println("Informe o tamanho do seu vetor:");
        n = sc.nextInt();

        int vetor[] = new int[n];
        System.out.println("Insira os valores");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        System.out.println("Insira um valor que vc queira saber a posição:");
        valor = sc.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (valor == vetor[i]) {
                System.out.printf("A posição do valor informado é: %d", i);
                valida = true;
                break;
            }
        }

        if (valida == false) {
            System.out.println("O numero informado não existe nesse vetor");
        }

        sc.close();
    }
}
