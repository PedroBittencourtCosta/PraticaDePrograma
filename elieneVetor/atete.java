package elieneVetor;

public class atete {
    public static void main(String[] args) {

        int vet[] = new int[20];
        int j = 1;

        for (int i = 0; i < vet.length; i++) {

            if (i % 2 == 0) {
                vet[i] = j++;
            } else {
                vet[i] = 0;
            }

            System.out.print(vet[i] + " ");
        }

    }
}
