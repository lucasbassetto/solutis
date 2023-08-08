package Lista4;

public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nome, String tipoAnimal, int idade, String habitat, Integer quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas);
    }

    @Override
    public void comer(double massa) {
        System.out.println("O Cachorro comeu " + massa + " Kg de alimento para cachorro");
    }

    @Override
    public void moverse(double distancia) {
        System.out.println("O Cachorro moveu-se " + distancia + " metros");
    }

    @Override
    public void dormir(double tempo) {
        System.out.println("O Cachorro dormiu " + tempo + " horas.");
    }
}
