// Verifique se o usuário é maior de idade ou não.

package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class _09_Idade {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean validAge = false;

        while (!validAge) {
            System.out.println("Digite a sua idade: ");
            int age = sc.nextInt();

            if (age < 0) {
                System.out.println("Digita uma idade válida");
            } else if (age <= 18) {
                System.out.println("Menor de idade");
                validAge = true;
            } else {
                System.out.println("Maior de idade");
                validAge = true;
            }
        }
    }
}





