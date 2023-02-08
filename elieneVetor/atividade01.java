package elieneVetor;

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int game = 1;
        int carbono = 0, dureza = 0, resistencia = 0;

        do {

            System.out.println("Classificando aços");
            System.out.println("Insira o conteudo de Carbono:");
            carbono = sc.nextInt();
            System.out.println("Insira a dureza Rockwell:");
            dureza = sc.nextInt();
            System.out.println("Insira a Resistencia a atraçao:");
            resistencia = sc.nextInt();

            if (carbono < 7 && dureza > 50 && resistencia > 80000) {

                System.out.println("Aço grau 10!!");

            } else if (carbono < 7 && dureza > 50) {

                System.out.println("Aço grau 9!!");

            } else if (carbono < 7 && dureza < 50 && resistencia < 80000) {

                System.out.println("Aço grau 8!!");

            } else if (carbono > 7 && dureza < 50 && resistencia < 80000) {

                System.out.println("Aço grau 7!!");

            }

            System.out.println("Quer classificar mais um aço?");
            System.out.println("1 para sim e 0 para nao");
            game = sc.nextInt();

        } while (game != 0);

        sc.close();
    }
}
