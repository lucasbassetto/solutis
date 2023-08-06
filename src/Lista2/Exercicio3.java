package Lista2;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int x = sc.nextInt();

        System.out.println("Números primos menores que " + x + ":");
        checkingNumbers(x);
    }

    public static void checkingNumbers(int x) {
        for (int i = 2; i < x; i++) {
            boolean isPrime = true;

            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

