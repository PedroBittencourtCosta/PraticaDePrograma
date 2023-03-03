package elieneVetor;

import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetA[] = new int[5];
        int vetB[] = new int[5];
        int vetC[] = new int[10];
        int j = 0;

        System.out.println("Insira o vetor A:");
        for (int i = 0; i < vetA.length; i++) {
            try {
                vetA[i] = sc.nextInt();
            } catch (Exception ex) {
                sc.nextLine();
                System.out.println("insira apenas numeros");
                vetA[i] = sc.nextInt();

            }

        }

        System.out.println("Insira o vetor B:");
        for (int i = 0; i < vetA.length; i++) {
            try {
                vetB[i] = sc.nextInt();
            } catch (Exception ex) {
                sc.nextLine();
                System.out.println("insira apenas numeros");
                vetB[i] = sc.nextInt();
            }

        }
        System.out.println("Vetor A:");
        for (int i = 0; i < vetA.length; i++) {
            System.out.println(vetA[i]);
        }

        System.out.println("Vetor B:");
        for (int i = 0; i < vetB.length; i++) {
            System.out.println(vetB[i]);
        }

        for (int i = 0; i < 5; i++) {
            vetC[j] = vetA[i];
            j++;
        }

        for (int i = 0; i < 5; i++) {
            vetC[j] = vetB[i];
            j++;
        }

        System.out.println("Vetor C:");
        for (int i = 0; i < vetC.length; i++) {
            System.out.println(vetC[i]);
        }

        sc.close();
    }
}
