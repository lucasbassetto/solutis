package Lista4;

public abstract class AnimalMarinhoAB extends AnimalAB {

    private Integer quantidadeBarbatanas;

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, Integer quantidadeBarbatanas) {
        super(nome, tipoAnimal, idade, habitat);
        this.quantidadeBarbatanas = quantidadeBarbatanas;
    }

    public Integer getQuantidadeBarbatanas() {
        return quantidadeBarbatanas;
    }

    public void setQuantidadeBarbatanas(Integer quantidadeBarbatanas) {
        this.quantidadeBarbatanas = quantidadeBarbatanas;
    }

    @Override
    public void comer(double massa) {
        System.out.println("O animal marinho comeu " + massa + " Kg de alimento para animal marinho");
    }

    @Override
    public void moverse(double distancia) {
        System.out.println("O animal marinho nadou " + distancia + " Km");
    }

    @Override
    public void dormir(double tempo) {
        System.out.println("O animal marinho dormiu " + tempo + " horas.");
    }
}
