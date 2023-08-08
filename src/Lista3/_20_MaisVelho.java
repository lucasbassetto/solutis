package Lista3;

import java.util.Scanner;

public class _20_MaisVelho {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String name1 = scanner.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Digite o nome da segunda pessoa: ");
        String name2 = scanner.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        int age2 = scanner.nextInt();

        String olderPerson, youngerPerson;

        if (age1 > age2) {
            olderPerson = name1;
            youngerPerson = name2;
        } else if (age1 < age2) {
            olderPerson = name2;
            youngerPerson = name1;
        } else {
            System.out.println("Ambas as pessoas têm a mesma idade.");
            scanner.close();
            return;
        }

        System.out.println("A pessoa mais velha é: " + olderPerson);
        System.out.println("A pessoa mais nova é: " + youngerPerson);
    }
}

