package vetor;

//Crie em Java um programa que contenha um vetor com 5 posições do tipo String, mostre na tela somente os valores da primeira posição e a ultima posição.

public class exe03 {
    public static void main(String[] args) {

        String receita[] = new String[5];

        receita[0] = "2 ovos";
        receita[1] = "300g de farinha";
        receita[2] = " 120ml de agua";
        receita[3] = " 12g de sal";
        receita[4] = " 35ml de oleo";

        System.out.printf("primeiro item do vetor: %s\n ultimo item do vetor: %s \n", receita[0], receita[4]);
    }
}
