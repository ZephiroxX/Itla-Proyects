package ejercicio4_numerospareswhile;

public class Ejercicio4_NumerosParesWhile {

    public static void main(String[] args) {

        int num = 0;

        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println("Numeros Pares " + num);
                num++;
            }

            num++;

        }
    }

}
