package Lista6._03_Exercicio;

import Lista6._02_Exercicio.Cachorro;
import Lista6._02_Exercicio.Cavalo;
import Lista6._02_Exercicio.Preguica;

public class Main {
    public static void main(String[] args) {

        Veterinario veterinario = new Veterinario();

        Cachorro cachorro = new Cachorro("Rex", 2);
        Cavalo cavalo = new Cavalo("Pé-de-pano", 5);
        Preguica preguica = new Preguica("Preguiça", 1);

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
