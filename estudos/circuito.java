package estudos;

import java.util.Scanner;

public class circuito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, aux = 0, lugar = 0;

        System.out.println("insira o tamanho do seu vetor:");
        n = sc.nextInt();

        int vetor[] = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("insira os numeros do seu vetor:");
            vetor[i] = sc.nextInt();

            if (aux < vetor[i]) {
                aux = vetor[i];
                lugar = i + 1;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("O maior numero é " + aux + "\nposicao " + lugar);

        sc.close();

    }
}
