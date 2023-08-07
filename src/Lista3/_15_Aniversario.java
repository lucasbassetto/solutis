// Verifique a validade de uma data de aniversário (solicite apenas o número do dia e do mês).
//Além de falar se a data está ok, informe também o nome do mês.
//Dica: meses com 30 dias: abril, junho, setembro e novembro.
package Lista3;

import java.util.Scanner;

public class _15_Aniversario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia desejado: ");
        int day = sc.nextInt();

        System.out.println("Digite o número do mês desejado: ");
        int month = sc.nextInt();

        boolean isValid = validateBirthday(day, month);

        if (isValid) {
            String monthName = getMonthName(month);
            System.out.println("Aniversário válido! Mês: " + monthName);
        } else {
            System.out.println("Data inválida");
        }
    }

    public static boolean validateBirthday(int day, int month) {
        if (month < 1 || month > 12) {
            return false;
        }

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return day >= 1 && day <= 30;
            case 2:
                return day >= 1 && day <= 28;
            default:
                return day >= 1 && day <= 31;
        }
    }

    public static String getMonthName(int month) {
        String[] monthNames = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "Mês inválido";
        }
    }
}

