//Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha.
//Para isto, peça o valor do seu salário e o valor do salário mínimo atual.

package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class _02_Salario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor do seu salário: ");
        double salary = sc.nextDouble();

        System.out.println("Digite o valor do salário mínimo atual: ");
        double minSalary = sc.nextInt();

        double quantity = salary / minSalary;

        System.out.printf("Quantidade de salários mínimos: %.3f%n", quantity);
    }
}
