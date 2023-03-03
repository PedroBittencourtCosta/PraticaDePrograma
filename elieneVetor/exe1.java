package elieneVetor;

//1 - Crie um programa em Java, contendo um vetor de tamanho o tamanho especificado pelo usuário, preencha o vetor com os valores informador pelo usuário e imprima a média dos valores
import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0, media = 0;

        System.out.println("Informe o tamanho do seu vetor:");
        n = sc.nextInt();

        int vetor[] = new int[n];
        System.out.println("Insira os valores");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();

            media = media + vetor[i];
        }

        media = media / vetor.length;
        System.out.printf("resultado da media: %d", media);
        sc.close();
    }
}
