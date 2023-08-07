// Determine qual é a idade que o usuário faz no ano atual. Para isso solicite o seu ano de
// nascimento e o ano atual.

package Lista3;

import java.util.Scanner;

public class _01_DeterminarIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu ano de nascimento: ");
        int yearBirth = sc.nextInt();

        System.out.println("Por favor, digite o ano atual: ");
        int currentYear = sc.nextInt();

        int age = currentYear - yearBirth;

        System.out.println("Você tem " + age + " anos");
    }
}
