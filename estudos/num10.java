package estudos;

// import java.util.Random;
import java.util.Scanner;

public class num10 {
    public static void main(String[] args) {
        // Random gerar = new Random();
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[40];

        for (int i = 0; i > vetor.length; i++) {
            vetor[i] = sc.nextInt();

        }

        sc.close();
    }
}
