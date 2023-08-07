// Transforme um número Racional (formado por numerador e denominador) para um número
//Real. Antes de dividir, verifique se o denominador é diferente de zero. Emita uma
//mensagem de alerta ao usuário se for zero.
package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class _08_RacionalNumber {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numerador da divisão: ");
        double numerator = sc.nextDouble();

        System.out.println("Digite o denominador da divisão: ");
        double denominator  = sc.nextDouble();

        if(denominator == 0) {
            System.out.println("Não existe divisão por 0!");
        } else {
            double result = numerator / denominator;
            System.out.println("Número real: " + result);
        }
    }
}
