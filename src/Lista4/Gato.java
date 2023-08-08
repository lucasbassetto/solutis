package Lista4;

public class Gato extends AnimalTerrestreAB {

    public Gato(String nome, String tipoAnimal, int idade, String habitat, Integer quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas);
    }

    @Override
    public void comer(double massa) {
        System.out.println("O gato comeu " + massa + " Kg de alimento para gatos");
    }

    @Override
    public void moverse(double distancia) {
        System.out.println("O gato moveu-se " + distancia + " metros");
    }

    @Override
    public void dormir(double tempo) {
        System.out.println("O gato dormiu " + tempo + " horas.");
    }
}
