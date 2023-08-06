package Lista1;

public class Exercicio13 {
    public static void main(String[] args) {

        int numeroPossibilidades = 0;

        for(int i = 1; i < 7; i++) {
            for(int j = 1; j < 7; j++) {
                if(i + j == 7) {
                    System.out.println(i + " + " + j + " = " + (i + j));
                    numeroPossibilidades++;
                }
            }
        }

        System.out.println("\nTotal de possibilidades: " + numeroPossibilidades);
    }
}
