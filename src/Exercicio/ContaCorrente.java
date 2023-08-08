package Exercicio;

public class ContaCorrente {
    private String numero;
    private String tipo;
    private Cliente primeiroTitular;
    private Cliente segundoTitular;
    private double saldo;
    private double limiteTotal;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String tipo, Cliente primeiroTitular, Cliente segundoTitular, double saldo, double limiteTotal) {
        this.numero = numero;
        this.tipo = tipo;
        this.primeiroTitular = primeiroTitular;
        this.segundoTitular = segundoTitular;
        this.saldo = saldo;
        this.limiteTotal = limiteTotal;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getPrimeiroTitular() {
        return primeiroTitular;
    }

    public void setPrimeiroTitular(Cliente primeiroTitular) {
        this.primeiroTitular = primeiroTitular;
    }

    public Cliente getSegundoTitular() {
        return segundoTitular;
    }

    public void setSegundoTitular(Cliente segundoTitular) {
        this.segundoTitular = segundoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public void credito(double valor) {
        saldo += valor;
    }

    public void debito(double valor) {
        if (saldo >= valor) {
            System.out.println("Saque efetuado.");
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para realizar o débito.");
        }
    }

    public void resumo() {
        System.out.println("Número da Conta Corrente: " + numero);
        System.out.println("Nome do primeiro titular: " + primeiroTitular.getNome());
        if (segundoTitular != null) {
            System.out.println("Nome do segundo titular: " + segundoTitular.getNome());
        }
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("Limite Atual: " + (limiteTotal + saldo));
        System.out.println("Limite Total: " + limiteTotal);

        if (saldo < 0) {
            System.out.println("Procure o seu gerente!");
        }
    }
}
