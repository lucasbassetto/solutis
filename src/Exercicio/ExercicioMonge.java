package Exercicio;

public class ExercicioMonge {
    public static void main(String[] args) {

        int numQuadros = 64; // Número total de quadros no tabuleiro de xadrez
        long graosNoQuadro = 1; // Começamos com 1 grão no primeiro quadro
        long totalGraos = graosNoQuadro; // Inicializamos o total com o primeiro quadro

        int casaOverflowInt = -1;
        int casaOverflowLong = -1;

        for (int quadro = 1; quadro < numQuadros; quadro++) {
            graosNoQuadro *= 2; // Dobra a quantidade de grãos no quadro atual

            // Verificar overflow para int
            if (casaOverflowInt == -1 && graosNoQuadro < 0) {
                casaOverflowInt = quadro;
            }

            // Verificar overflow para long
            if (casaOverflowLong == -1 && graosNoQuadro < 0) {
                casaOverflowLong = quadro;
            }

            totalGraos += graosNoQuadro; // Adiciona os grãos do quadro atual ao total
        }

        System.out.println("Total de grãos esperados: " + totalGraos);

        if (casaOverflowInt != -1) {
            System.out.println("Overflow ocorre na casa " + casaOverflowInt + " para int.");
        }

        if (casaOverflowLong != -1) {
            System.out.println("Overflow ocorre na casa " + casaOverflowLong + " para long.");
        }
    }
}

