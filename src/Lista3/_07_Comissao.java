// Calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor da
// despesa de um cliente.
package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class _07_Comissao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da conta: ");
        double customerAccount = sc.nextDouble();

        double commision = customerAccount * 0.1;

        System.out.println("A comissão do garçom é de: R$ " + commision);
    }
}
