// Receba do usuário o nome de um mês. Exiba o número equivalente.
package Lista3;

import java.util.Scanner;

public class _14_Mes {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o nome de um mês: ");
            String monthName = sc.nextLine();

            int monthNumber = getMonthNumber(monthName);

            if (monthNumber != -1) {
                System.out.println("O número equivalente para o mês de " + monthName + " é: " + monthNumber);
            } else {
                System.out.println("Nome de mês inválido.");
            }

            sc.close();
        }

        public static int getMonthNumber(String monthName) {
            String[] months = {
                    "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                    "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
            };

            for (int i = 0; i < months.length; i++) {
                if (months[i].equalsIgnoreCase(monthName)) {
                    return i + 1; // Months are 1-indexed
                }
            }

            return -1; // Invalid month name
        }
    }
