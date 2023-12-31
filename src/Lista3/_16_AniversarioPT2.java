// Acrescente no exercício anterior se a pessoa nasceu no 1º, 2º, 3º ou 4º trimestre.
package Lista3;

import java.util.Scanner;

public class _16_AniversarioPT2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia desejado: ");
        int day = sc.nextInt();

        System.out.println("Digite o número do mês desejado: ");
        int month = sc.nextInt();

        boolean isValid = validateBirthday(day, month);

        if (isValid) {
            String monthName = getMonthName(month);
            int quarter = getQuarter(month);
            System.out.println("Aniversário válido! Mês: " + monthName + ", Trimestre: " + quarter);
        } else {
            System.out.println("Aniversário inválido");
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
                "Janeiro", "Fevereiro", "Março", "Abril", "May", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "Mês inválido";
        }
    }

    public static int getQuarter(int month) {
        if (month >= 1 && month <= 3) {
            return 1;
        } else if (month >= 4 && month <= 6) {
            return 2;
        } else if (month >= 7 && month <= 9) {
            return 3;
        } else {
            return 4;
        }
    }
}

