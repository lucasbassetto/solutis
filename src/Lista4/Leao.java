package Lista4;

public class Leao extends AnimalAB {

    @Override
    public void comer(double massa) {
        System.out.println("O leão comeu " + massa + " Kg de alimento para leão");
    }

    @Override
    public void moverse(double distancia) {
        System.out.println("O leão moveu-se " + distancia + " Km");
    }

    @Override
    public void dormir(double tempo) {
        System.out.println("O leão dormiu " + tempo + " horas.");
    }
}
