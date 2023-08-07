package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class _10_EmprestimoBanco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salario bruto: ");
        double grossSalary = sc.nextDouble();

        System.out.println("Digite os descontos: ");
        double deductions = sc.nextDouble();

        System.out.println("Digite o valor do empréstimo desejado: ");
        double loanAmount = sc.nextDouble();

        boolean loanApproved = isLoanEligible(grossSalary, deductions, loanAmount);

        if(loanApproved) {
            System.out.println("Emprestimo aprovado.");
        } else {
            System.out.println("Emrpestimo negado.");
        }
    }
    public static boolean isLoanEligible(double grossSalary, double deductions, double loanAmount) {
        double netSalary = grossSalary - deductions;
        double maxLoanAmount = netSalary * 0.3;

        return loanAmount <= maxLoanAmount;
    }
}
