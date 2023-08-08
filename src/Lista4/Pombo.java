package Lista4;

public class Pombo extends AnimalVoadorAB{

    public Pombo(String nome, String tipoAnimal, int idade, String habitat, Integer envergaduraAsa) {
        super(nome, tipoAnimal, idade, habitat, envergaduraAsa);
    }

    @Override
    public void comer(double massa) {
        System.out.println("O pombo comeu " + massa + " Kg de alimento para pombo");
    }

    @Override
    public void moverse(double distancia) {
        System.out.println("O pombo voou " + distancia + " Km");
    }

    @Override
    public void dormir(double tempo) {
        System.out.println("O pombo dormiu " + tempo + " horas.");
    }
}
