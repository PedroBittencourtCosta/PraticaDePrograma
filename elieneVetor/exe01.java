package elieneVetor;

import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota[] = new int[10];
        int media = 0, acomulaMedia = 0;

        System.out.println("insira as notas ai:");

        for (int i = 0; i < nota.length; i++) {
            nota[i] = sc.nextInt();

            media = media + nota[i];

        }

        media = media / nota.length;

        for (int i = 0; i < nota.length; i++) {

            if (nota[i] > media) {
                acomulaMedia = acomulaMedia + 1;
            }

            if (nota[i] >= 60) {
                System.out.println("ela passou hehe!!");
            } else {
                System.out.println("ela nao passou :(");
            }

        }

        System.out.println("quantidade de alunos com nota superior a media: " + acomulaMedia);
        System.out.println("a media é: " + media);
        sc.close();
    }
}
