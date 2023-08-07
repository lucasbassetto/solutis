package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class _13_NotaPT2 {
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

        if (status.equalsIgnoreCase("Recuperação")) {
            System.out.println("O estudante está de recuperação e erá realizar uma prova final.");
            System.out.println("Digite a nota da prova final: ");
            double finalExamGrade = sc.nextDouble();

            double finalAverage = (average + finalExamGrade) / 2;

            String finalStatus = determineFinalStatus(finalAverage);
            System.out.println("Status final do estudante: " + finalStatus);
        }
    }

    public static double calculateAverage(double grade1, double grade2, double grade3) {
        return (grade1 + grade2 + grade3) / 3;
    }

    public static String determineStatus(double average) {
        if (average >= 7) {
            return "Aprovado";
        } else if (average >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static String determineFinalStatus(double finalAverage) {
        if (finalAverage >= 5) {
            return "Aprovado no exame final";
        } else {
            return "Reprovado após realizar o exame final";
        }
    }
}
