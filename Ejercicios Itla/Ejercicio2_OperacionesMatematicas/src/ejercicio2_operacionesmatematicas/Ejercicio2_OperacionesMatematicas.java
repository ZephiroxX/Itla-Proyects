package ejercicio2_operacionesmatematicas;

import java.util.Scanner;

public class Ejercicio2_OperacionesMatematicas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = input.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = input.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = num1 / num2;
        
        
        
        System.out.println("La suma de los numeros "+suma);
        System.out.println("La resta de los numeros "+resta);
        System.out.println("La multiplicacion de los numeros "+multiplicacion);
        System.out.println("La division de los numeros "+division);
    }

}
