// Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.
package Lista3;

import java.util.Locale;
import java.util.Scanner;
public class _04_MediaAritimetica {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a 1ª nota: ");
        double grade1 = sc.nextDouble();

        System.out.println("Digite a 2ª nota: ");
        double grade2 = sc.nextDouble();

        System.out.println("Digite a 3ª nota: ");
        double grade3 = sc.nextDouble();

        System.out.println("Digite a 4ª nota: ");
        double grade4 = sc.nextDouble();

        double arithmeticAverage = (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.println("A media aritimética é: " + arithmeticAverage);
    }
}
