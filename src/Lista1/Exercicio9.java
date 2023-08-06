// Encontre o quadrado dos números de 0 até 10. Utilize o controle de fluxo for.

package Lista1;

public class Exercicio9 {

    public static void main(String[] args) {

        for(int i = 0; i < 11; i++) {
            int x = i * i;
            System.out.println("O quadrado de " + i + " é " + x);
        }
    }
}
