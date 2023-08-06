//Pretende-se escrever um programa que leia do teclado uma distância
//expressa em milhas, converte-a para quilômetros e apresenta o resultado no
//console. (fórmula de conversão: 1 milha = 1.609 km).

package Lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a distância em milhas");
        double miles = sc.nextDouble();

        double kilometers = miles * 1.609;

        System.out.printf("A distância é de " + kilometers + " quilômetros");
    }
}
