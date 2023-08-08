package Lista3;

import java.util.Scanner;

public class _18_AniversarioPT4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia desejado: ");
        int day = sc.nextInt();

        System.out.print("Digite o número do mês desejado: ");
        int month = sc.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int yearOfBirth = sc.nextInt();

        System.out.print("Digite o dia atual: ");
        int currentDay = sc.nextInt();

        System.out.print("Digite o número do mês atual: ");
        int currentMonth = sc.nextInt();

        System.out.print("Digite o ano atual: ");
        int currentYear = sc.nextInt();

        boolean isValid = validateBirthday(day, month);

        if (isValid) {
            String monthName = getMonthName(month);
            int quarter = getQuarter(month);
            String zodiacSign = getZodiacSign(month, day);
            int age = calculateAge(yearOfBirth, currentYear, month, currentMonth, day, currentDay);
            System.out.println("Aniversário válido! Mês: " + monthName + ", Trimestre: " + quarter + ", Signo: " + zodiacSign + ", Idade: " + age);
        } else {
            System.out.println("Aniversário inválido");
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
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
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

    public static String getZodiacSign(int month, int day) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Áries";
        } else if (month == 4 || month == 5 && day <= 20) {
            return "Touro";
        } else if (month == 5 || month == 6 && day <= 20) {
            return "Gêmeos";
        } else if (month == 6 || month == 7 && day <= 22) {
            return "Câncer";
        } else if (month == 7 || month == 8 && day <= 22) {
            return "Leão";
        } else if (month == 8 || month == 9 && day <= 22) {
            return "Virgem";
        } else if (month == 9 || month == 10 && day <= 22) {
            return "Libra";
        } else if (month == 10 || month == 11 && day <= 21) {
            return "Escorpião";
        } else if (month == 11 || month == 12 && day <= 21) {
            return "Sagitário";
        } else if (month == 12 || month == 1 && day <= 19) {
            return "Capricórnio";
        } else if (month == 1 || month == 2 && day <= 18) {
            return "Aquário";
        } else {
            return "Peixes";
        }
    }

    public static int calculateAge(int yearOfBirth, int currentYear, int birthMonth, int currentMonth, int birthDay, int currentDay) {
        int age = currentYear - yearOfBirth;

        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        return age;
    }
}