// 2. Faça um programa que receba 2 valores e retorne o maior entre eles.

package Lista2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextInt();
        double y = sc.nextInt();

        System.out.println(maxValue(x, y));
    }
    public static double maxValue(double x, double y) {
        return Math.max(x, y);
    }
}
