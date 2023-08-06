package Lista1;

public class Exercicio12 {
    public static void main(String[] args) {
        System.out.println("Utilizando int: ");
        for(int i = 0; i <= 10; i++) {
            if(i % 3 == 0) {
                int resultado = i / 2;
                System.out.println("Divisão de " + i + " por 2: " + resultado);
            }
        }


        System.out.println("\nUtilizando double: ");
        for(int i = 0; i <= 10; i++) {
            if(i % 3 == 0) {
                double resultado = (double) i / 2;
                System.out.println("Divisão de " + i + " por 2: " + resultado);
            }
        }
    }
}
