package Lista3;

import java.util.Scanner;

public class _21_Emprestimo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o cargo (Diretoria, Gerência ou Operacional): ");
        String position = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salary = scanner.nextDouble();

        double loanAmount = calculateLoanAmount(position, salary);

        if (loanAmount >= 0) {
            System.out.println("O funcionário de cargo " + position + " pode obter um empréstimo de R$ " + loanAmount);
        } else {
            System.out.println("Cargo inválido");
        }

        scanner.close();
    }

    public static double calculateLoanAmount(String position, double salary) {
        double loanPercentage;

        if (position.equalsIgnoreCase("Diretoria")) {
            loanPercentage = 0.3;
        } else if (position.equalsIgnoreCase("Gerência")) {
            loanPercentage = 0.25;
        } else if (position.equalsIgnoreCase("Operacional")) {
            loanPercentage = 0.2;
        } else {
            return -1;
        }

        return salary * loanPercentage;
    }
}

