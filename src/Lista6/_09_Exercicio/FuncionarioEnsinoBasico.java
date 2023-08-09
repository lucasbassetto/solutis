package Lista6._09_Exercicio;

public class FuncionarioEnsinoBasico extends FuncionarioEscolaridade {

    public FuncionarioEnsinoBasico() {

    }

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaEnsinoBasico) {
        super(nome, codigoFuncional, escolaEnsinoBasico, null, null);
    }

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
    }
    @Override
    public double calcularRendaTotal() {
        return getRenda() + getRenda() * 0.1 + getComissao().getValor();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\nCódigo Funcional: " + getCodigoFuncional()
                +"\nRenda: " + calcularRendaTotal();
    }
}
