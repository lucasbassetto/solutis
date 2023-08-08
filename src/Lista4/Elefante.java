package Lista4;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, String tipoAnimal, int idade, String habitat, Integer quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas);
    }

    @Override
    public void comer(double massa) {
        System.out.println("O elefante comeu " + massa + " Kg de alimento para elefante.");
    }

    @Override
    public void moverse(double distancia) {
        System.out.println("O elefante moveu-se " + distancia + " metros.");
    }

    @Override
    public void dormir(double tempo) {
        System.out.println("O elefante dormiu " + tempo + " horas.");
    }
}
