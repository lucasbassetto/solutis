package Lista6._03_Exercicio;

import Lista6._02_Exercicio.Animal;

public class Veterinario {

    public void examinar(Animal animal) {
        System.out.println("Examinando o animal..." + animal.getName());
        animal.emitirSom();
        System.out.println();
    }
}
