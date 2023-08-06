// Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a
// palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita
// ou da direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc

package Lista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra");

        checkIfIsPalindrome(sc.nextLine());
    }

    public static void checkIfIsPalindrome(String word) {
        StringBuilder reverseString = new StringBuilder();

        for (int i = (word.length() - 1); i >= 0; i--) {
            reverseString.append(word.charAt(i));
        }

        if (word.equalsIgnoreCase(reverseString.toString())) {
            System.out.println(word + " é um palíndromo.");
        } else {
            System.out.println(word + " não é um palíndromo.");
        }
    }
}
