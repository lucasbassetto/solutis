package Lista2;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();

        int comparacao = palavra1.compareTo(palavra2);
        String palavraMaior = (palavra1.length() >= palavra2.length()) ? palavra1 : palavra2;

        System.out.println("Palavras em ordem alfabética: " + (comparacao < 0 ? palavra1 + ", " + palavra2 : palavra2 + ", " + palavra1));
        System.out.println("A palavra com mais caracteres: " + palavraMaior);

    }
}
