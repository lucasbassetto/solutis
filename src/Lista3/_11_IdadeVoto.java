package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class _11_IdadeVoto {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean validAge = false;

        while (!validAge) {
            System.out.println("Digite a sua idade: ");
            int age = sc.nextInt();

            if (age < 0) {
                System.out.println("Digita uma idade válida");
            } else if (age < 16) {
                System.out.println("Você não pode votar");
                validAge = true;
            } else if (age < 18 || age >= 65) {
                System.out.println("Voto facultativo");
                validAge = true;
            } else {
                System.out.println("Voto obrigatório");
                validAge = true;
            }
        }
    }
}
