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
            System.out.println("Valid birthday! Month: " + monthName);
        } else {
            System.out.println("Invalid birthday.");
        }

        sc.close();
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
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "Invalid Month";
        }
    }
}

