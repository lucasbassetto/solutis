// Imprima produto dos números de ímpares de 15 a 30, usando os tipos de
// dados int e float

package Lista2;

public class Exercicio6 {

    public static void main(String[] args) {

        int productInt = 1;
        float productFloat = 1;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                productInt *= i;
                productFloat *= i;
            }
        }
        System.out.println("Produto dos números ímpares (usando int): " + productInt);
        System.out.println("Produto dos números ímpares (usando float): " + productFloat);

    }
}
