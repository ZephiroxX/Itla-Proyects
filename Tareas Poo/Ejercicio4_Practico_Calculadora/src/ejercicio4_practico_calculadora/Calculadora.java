
package ejercicio4_practico_calculadora;


public class Calculadora {


    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }


    public int sumar(int a, int b, int c) {
        return sumar(a, b) + c;
    }

    public int restar(int a, int b, int c) {
        return restar(a, b) - c;
    }

    public int multiplicar(int a, int b, int c) {
        return multiplicar(a, b) * c;
    }


    public int sumar(int a, int b, int c, int d) {
        return sumar(a, b, c) + d;
    }

    public int restar(int a, int b, int c, int d) {
        return restar(a, b, c) - d;
    }

    public int multiplicar(int a, int b, int c, int d) {
        return multiplicar(a, b, c) * d;
    }
}