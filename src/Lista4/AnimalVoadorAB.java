package Lista4;

public abstract class AnimalVoadorAB extends AnimalAB{

    private Integer envergaduraAsa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, Integer envergaduraAsa) {
        super(nome, tipoAnimal, idade, habitat);
        this.envergaduraAsa = envergaduraAsa;
    }

    public Integer getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public void setEnvergaduraAsa(Integer envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

    @Override
    public void comer(double massa) {
        System.out.println("O animal voador comeu " + massa + " Kg de alimento para animal voador");
    }

    @Override
    public void moverse(double distancia) {
        System.out.println("O animal voador voou " + distancia + " Km");
    }

    @Override
    public void dormir(double tempo) {
        System.out.println("O animal voador dormiu " + tempo + " horas.");
    }
}
