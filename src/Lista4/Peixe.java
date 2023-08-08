package Lista4;

public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, String tipoAnimal, int idade, String habitat, Integer quantidadeBarbatanas) {
        super(nome, tipoAnimal, idade, habitat, quantidadeBarbatanas);
    }

    @Override
    public void comer(double massa) {
        System.out.println("O peixe comeu " + massa + " Kg de alimento para peixe");
    }

    @Override
    public void moverse(double distancia) {
        System.out.println("O peixe nadou " + distancia + " Km");
    }

    @Override
    public void dormir(double tempo) {
        System.out.println("O peixe dormiu " + tempo + " horas.");
    }

}
