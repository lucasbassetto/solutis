//Solicite a quantidade de homens e de mulheres de uma turma da faculdade. Em seguida
//calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.

package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class _03_Percentual {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de homens da sua turma: ");
        int quantityMen = sc.nextInt();

        System.out.println("Digite a quantidade de mulheres da sua turma: ");
        int quantityWomen = sc.nextInt();

        int total = quantityMen + quantityWomen;
        double percentageMen = ((double) quantityMen / total) * 100;
        double percentageWomen = ((double) quantityWomen / total) * 100;

        System.out.printf("Percentual de homens: %.2f%%",  percentageMen);
        System.out.printf("\nPercentual de mulheres: %.2f%%", percentageWomen);
    }
}
