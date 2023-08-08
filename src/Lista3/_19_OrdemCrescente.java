package Lista3;

import java.util.Scanner;

public class _19_OrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        if (num1 < num2) {
            System.out.println("Numeros em ordem crescente: " + num1 + ", " + num2);
        } else if (num1 > num2) {
            System.out.println("Numeros em ordem crescente: " + num2 + ", " + num1);
        } else {
            System.out.println("Os numeros sao iguais: " + num1 + ", " + num2);
        }
    }
}
