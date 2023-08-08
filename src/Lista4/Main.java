package Lista4;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex", "Terrestre", 5, "Casa", 4);
        Gato gato = new Gato("Flint", "Terrestre", 2, "Casa", 4);
        Elefante elefante = new Elefante("Dumbo", "Terrestre", 2, "Savana", 4);
        Peixe peixe = new Peixe("Nemo", "Marinho", 1, "Oceano", 2);

        cachorro.moverse(2);
        cachorro.comer(12);
        cachorro.dormir(5);
        System.out.println();

        gato.moverse(2);
        gato.comer(10);
        gato.dormir(2);
        System.out.println();

        elefante.moverse(2);
        elefante.comer(15);
        elefante.dormir(10);
        System.out.println();

        peixe.moverse(3);
        peixe.comer(2);
        peixe.moverse(10);
    }
}
