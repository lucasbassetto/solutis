package Lista6._04_Exercicio4;

public class Aguia extends Animal{

    public Aguia(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de aguia");
    }
}
