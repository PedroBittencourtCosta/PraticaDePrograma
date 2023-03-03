package elieneVetor;

import java.util.Scanner;

public class ese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetorA[] = new int[6];
        int vetorB[] = new int[6];
        int n = 0;
        int vetorC[] = new int[12];
        // int b = 0;
        // System.out.println(b = (int) (Math.random() * 11));
        System.out.println("aaaaaaaaa");
        for (int i = 0; i < 6; i++) {
            vetorA[i] = sc.nextInt();
        }
        System.out.println("bbbbbbbbbb");
        for (int i = 0; i < 6; i++) {
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            vetorC[n] = vetorA[i];
            n++;
        }

        for (int i = 0; i < 6; i++) {
            vetorC[n] = vetorB[i];
            n++;
        }

        for (int i = 0; i < 12; i++) {
            System.out.println(vetorC[i]);
        }

        sc.close();

    }
}
