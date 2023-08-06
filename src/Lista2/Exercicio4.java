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
