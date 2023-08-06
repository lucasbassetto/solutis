package Lista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> tanques = new ArrayList<>();

        while (true) {
            System.out.println("[1] - Cadastrar novo tanque de gasolina");
            System.out.println("[2] - Ver tanques cadastrados no sistema");
            System.out.println("[0] - Sair");
            System.out.print("Digite a opção escolhida: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> cadastrarTanque(scanner, tanques);
                case 2 -> mostrarTanques(tanques);
                case 0 -> {
                    System.out.println("Obrigado!");
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void cadastrarTanque(Scanner scanner, List<Integer> tanques) {
        System.out.print("Digite os quilômetros: ");
        int km = scanner.nextInt();
        System.out.print("Digite a quantidade de gasolina: ");
        int gasolina = scanner.nextInt();
        double consumo = (double) km / gasolina;
        tanques.add(km);
        tanques.add(gasolina);

        System.out.println("Quilometros: " + km);
        System.out.println("Gasolina: " + gasolina);
        System.out.printf("Consumo: %.2f km/l%n", consumo);
        System.out.println("Operação efetuada com sucesso.");
    }

    public static void mostrarTanques(List<Integer> tanques) {
        if (tanques.isEmpty()) {
            System.out.println("Você não tem tanque cadastrado! Por favor, cadastre um.");
        } else {
            for (int i = 0; i < tanques.size(); i += 2) {
                int km = tanques.get(i);
                int gasolina = tanques.get(i + 1);
                double consumo = (double) km / gasolina;

                System.out.println("Tanque " + ((i / 2) + 1) + ":");
                System.out.println("Quilometros: " + km);
                System.out.println("Gasolina: " + gasolina);
                System.out.printf("Consumo: %.2f km/l%n", consumo);
            }
        }
    }
}