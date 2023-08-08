package Exercicio;

public class ProgramaBanco {
    public static void main(String[] args) {

        Cliente primeiroTitular = new Cliente("12345678901", "João", "Rua A", "1990");
        Cliente segundoTitular = new Cliente("98765432109", "Maria", "Rua B", "1995");

        ContaCorrente conta = new ContaCorrente("12345", "Especial", primeiroTitular, segundoTitular, 1000.0, 2000.0);

        conta.credito(500.0);
        conta.debito(200.0);

        conta.resumo();
    }
}
