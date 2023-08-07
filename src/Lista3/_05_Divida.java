//Calcule e exiba o valor final de uma dívida. Para isto pergunte ao usuário o valor inicial do
//débito, a quantidade de meses e os juros mensais. Use o calculo de juros simples.
package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class _05_Divida {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor inicial da dívida: ");
        double initialAmount = sc.nextDouble();

        System.out.println("Digite a quantidade de meses: ");
        int numberOfMonths = sc.nextInt();

        System.out.println("Digite a taxa de juros mensais (em porcentagem, por exemplo, 5 para 5%): ");
        double monthlyInterestRate  = sc.nextDouble() / 100;

        double finalAmount = calculateDebt(initialAmount, numberOfMonths, monthlyInterestRate);

        System.out.println("O valor final da dívida é: " + finalAmount);
    }

    public static double calculateDebt(double initialAmount, int numberOfMonths, double monthlyInterestRate) {
        double interest = initialAmount * monthlyInterestRate * numberOfMonths;
        return initialAmount + interest;
    }
}
