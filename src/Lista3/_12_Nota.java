// A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de
// recuperação ou foi reprovado. A média de aprovação é >= 7.0; a média de recuperação é
// >= 5.0 e < 7.0; e a média do reprovado é <; 5.0
package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class _12_Nota {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a 1ª nota: ");
        double grade1 = sc.nextDouble();

        System.out.println("Digite a 2ª nota: ");
        double grade2 = sc.nextDouble();

        System.out.println("Digite a 3ª nota: ");
        double grade3 = sc.nextDouble();

        double average = calculateAverage(grade1, grade2, grade3);

        String status = determineStatus(average);

        System.out.println("Status do estudante: " + status);
    }

    public static double calculateAverage(double grade1, double grade2, double grade3) {
        return (grade1 + grade2 + grade3) / 3;
    }

    public static String determineStatus(double average) {
        if (average >= 7) {
            return "Aprovado";
        } else if (average < 7 && average >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
