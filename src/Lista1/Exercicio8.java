// Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.

package Lista1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();

        if(numeroPar(n)) {
            System.out.println("O número " + n + " é par.");
        } else {
            System.out.println("O número " + n + " é ímpar.");
        }
    }

    public static boolean numeroPar(int num) {
        return num % 2 == 0;
    }
}