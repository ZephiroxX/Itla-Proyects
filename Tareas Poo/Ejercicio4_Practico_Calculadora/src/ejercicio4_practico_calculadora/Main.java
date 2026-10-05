
package ejercicio4_practico_calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== PRUEBA DE 2 PARÁMETROS ===");
        System.out.println("Suma (10, 5): " + calc.sumar(10, 5));
        System.out.println("Resta (10, 5): " + calc.restar(10, 5));
        System.out.println("Multiplicación (10, 5): " + calc.multiplicar(10, 5));
        System.out.println("División (10, 5): " + calc.dividir(10, 5));

        System.out.println("\n=== PRUEBA DE 3 PARÁMETROS ===");
        System.out.println("Suma (10, 5, 2): " + calc.sumar(10, 5, 2));
        System.out.println("Resta (10, 5, 2): " + calc.restar(10, 5, 2));
        System.out.println("Multiplicación (10, 5, 2): " + calc.multiplicar(10, 5, 2));

        System.out.println("\n=== PRUEBA DE 4 PARÁMETROS ===");
        System.out.println("Suma (10, 5, 2, 1): " + calc.sumar(10, 5, 2, 1));
        System.out.println("Resta (10, 5, 2, 1): " + calc.restar(10, 5, 2, 1));
        System.out.println("Multiplicación (10, 5, 2, 1): " + calc.multiplicar(10, 5, 2, 1));
    }
}