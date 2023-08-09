package Lista6._06_Exercicio;

public class FuncionarioSemEscolaridade extends Funcionario {

    public FuncionarioSemEscolaridade(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\nCódigo Funcional: " + getCodigoFuncional()
                + "\nRenda: " + getRenda();

    }
}
