
package validacion.de.edad;

import java.util.Scanner;

public class ValidacionDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;

        do {
            System.out.print("Ingrese su edad (1-120): ");
            edad = scanner.nextInt();
            if (edad < 1 || edad > 120) {
                System.out.println("Edad invalida. Intente nuevamente.");
            }
        } while (edad < 1 || edad > 120);

        System.out.println("\nEdad registrada: " + edad + " años");

        if (edad < 18) {
            System.out.println("Categoria: Menor de edad");
        } else if (edad < 65) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Categoria: Adulto mayor");
        }

        scanner.close();
    }
}