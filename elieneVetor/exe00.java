package elieneVetor;

//Implementar um programa para ler 5 notas de alunos e imprimi-las.

import java.util.Scanner;

public class exe00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notas[] = new int[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira as notas:");
            notas[i] = sc.nextInt();

        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        sc.close();

    }
}
