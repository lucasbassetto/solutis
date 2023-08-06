//Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na
//tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 , Terça corresponde a 2, e assim por diante. Utilizando Array.

package Lista2;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um númerod e 1 a 7");
        int n = sc.nextInt();

        System.out.println(getDayName(n));
    }

    private static String getDayName(int n) {
        String[] daysName = { "Segunda feira", "Terça feira", "Quarta feira", "Quinta feira", "Sexta feira", "Sábado", "Domingo"
        };

        if (n >= 1 && n <= 7) {
            return daysName[n - 1];
        } else {
            return "Número inválido. Insira um valor de 1 a 7.";
        }
    }
}
