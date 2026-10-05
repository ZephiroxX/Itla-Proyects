
package ejercicio1;

//🟢 Ejercicio 1 — Número positivo, negativo o cero ⭐

import java.util.Scanner;

//
//Crea un programa en Java que:
//
//Solicite al usuario un número entero.
//Determine si el número es:
//Positivo.
//Negativo.
//Cero.
//Muestre el resultado por consola.

public class Ejercicio1 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        
        if(num > 0)
        {
            System.out.println("Es un numero positivo");
        }
        else if(num < 0 )
        {
            System.out.println("Es un numero negativo");
        }
        else
        {
            System.out.println("Es 0");
        }

    }

}
