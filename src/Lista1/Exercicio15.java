package Lista1;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        double soma = 0;
        double mediaAritimetica;

        System.out.println("Entre com os 50 números desejados");

        do {
            double n = sc.nextDouble();
            soma += n;
            i++;
        } while(i < 50);

        mediaAritimetica = soma / i;

        System.out.println("A média aritmética dos números é: " + mediaAritimetica);
    }
}
