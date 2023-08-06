// Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e
// 100, usando os tipos de dados int e double .

package Lista2;
public class Exercicio7 {

    public static void main(String[] args) {

        System.out.println("Resultado da divisão por 2 de todos os múltiplos de 3: ");
        for(int i = 0; i <= 100; i++) {
            if(i % 3 == 0) {
                System.out.print("Integer: " + i/2);
                System.out.println(" Double: " + (double) i/2);
            }
        }
    }
}
