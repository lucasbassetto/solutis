// Escreva uma classe que conte a quantidade de vogais, espaços em
// brancos e consoantes de uma cadeia de caracteres.
package Lista2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String stringVogais = "AEIOU";
        int vogais = 0;
        int consoantes = 0;
        int espacosBrancos = 0;

        System.out.println("Escreva uma sequência de caracteres: ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toUpperCase(input.charAt(i));
            if (ch >= 'A' && ch <= 'Z') {
                if (stringVogais.indexOf(ch) != -1) {
                    vogais++;
                } else {
                    consoantes++;
                }
            } else {
                espacosBrancos++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Espaços em branco: " + espacosBrancos);
    }
}

