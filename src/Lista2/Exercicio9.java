// Escreva uma classe para calcular a área de um círculo, sabendo que a área
//é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá
//que ser arredondado
package Lista2;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = calcArea(raio);

        System.out.printf("A área do círculo é: %.3f%n", area);
    }

    public static double calcArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

}
