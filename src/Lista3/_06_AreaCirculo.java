package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class _06_AreaCirculo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("A área do círculo, em metros quadrados é: %.3f%n", area);
    }
}
