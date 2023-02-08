package elieneVetor;

//A Distribuidora de Combustíveis Ave Maria irá dar uma aumento em função da quantidade de
//combustível comprado anualmente por seus clientes. Os postos que consomem em m ́media até 50.000
//litros de combustível mês, terão aumento de 20%. Os postos que consomem acima desta media, 12%
//de aumento. A distribuidora irá fornecer o nome do posto e seu consumo anual. Calcule e escreva //qual será o preço do litro de combustível para o posto, levando-se em conta que hoje a //distribuidora cobra R$1,63 por litro.

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String posto = "";
        int consumoAno = 0, consumoMes = 0;
        double valor = 1.63;

        System.out.println("Insira o nome do posto:");
        posto = sc.nextLine();
        System.out.println("Insira o seu consumo anual:");
        consumoAno = sc.nextInt();

        consumoMes = consumoAno / 12;

        if (consumoMes <= 50000) {

            valor += (1.63 * 20) / 100;

        } else {

            valor += (1.63 * 12) / 100;
        }

        System.out.println("O combustivel do posto " + posto + " é de: " + valor);

        sc.close();
    }
}
