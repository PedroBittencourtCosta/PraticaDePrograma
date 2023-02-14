package elieneVetor;

//Construa um programa que, dado o primeiro elemento e a razão de uma progressão aritmética
//(PA), imprima todos os n primeiros elementos da PA, em que n também é informado pelo usuário.
//Lembre-se que uma PA pode ser crescente ou decrescente. Em seguida, leia novo termo e razão e
//imprima os n primeiros elementos de uma progressão geométrica (PG).
//Formula de PA - an=a1+(n-1).r
//Formula de PG - an= a1 . r^(n-1)

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0, primeiro = 0, razao = 0, PA = 0;
        double PG = 0;

        System.out.println("Innsira o valor de N:");
        num = sc.nextInt();
        System.out.println("Insira o primeiro termo:");
        primeiro = sc.nextInt();
        System.out.println("Insira a razao:");
        razao = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            PA = primeiro + ((i - 1) * razao);
            System.out.println(PA);
        }

        System.out.println(" ");
        System.out.println("PA");
        System.out.println(" ");

        for (int i = 1; i < num; i++) {

            PG = primeiro * Math.pow(razao, (i - 1));
            System.out.println(PG);
        }

        System.out.println("PG");
        sc.close();
    }
}
