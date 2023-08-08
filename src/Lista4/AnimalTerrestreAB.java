package Lista4;

public abstract class AnimalTerrestreAB extends AnimalAB {

    private Integer quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, Integer quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat);
        this.quantidadePatas = quantidadePatas;
    }

    public Integer getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(Integer quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    @Override
    public void comer(double massa) {
        System.out.println("O animal terrestre comeu " + massa + " Kg de alimento animal terrestre");
    }

    @Override
    public void moverse(double distancia) {
        System.out.println("O animal terrestre moveu-se " + distancia + " Km");
    }

    @Override
    public void dormir(double tempo) {
        System.out.println("O animal terrestre dormiu " + tempo + " horas.");
    }
}
