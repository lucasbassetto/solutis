// Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B  e que a variável B passe
// a possuir o valor da variável A. Apresentar os valores trocados.

package Lista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, temp;

        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();

        temp = A;
        A = B;
        B = temp;

        System.out.println("Valores trocados: A = " + A + ", B = " + B);

    }
}