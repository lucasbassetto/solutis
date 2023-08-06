package Lista1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigo = sc.nextInt();

        String produto;

        if (codigo == 001) {
            produto = "Parafuso";
        } else if (codigo == 002) {
            produto = "Porca";
        } else if (codigo == 003) {
            produto = "Prego";
        } else {
            produto = "Diversos";
        }

        System.out.println("Nome do produto: " + produto);
    }
}
