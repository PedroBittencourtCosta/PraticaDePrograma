package estudos;

public class metodos {
    public static void main(String[] args) {

        System.out.println(soma(2, 3));

        frase();
    }

    public static int soma(int n1, int n2) {
        int soma = n1 + n2;
        return soma;
    }

    public static void frase() {
        System.out.println("hello word");
    }
}
