
package ejercicio4_condicional;

import java.util.Scanner;

//Ahora vamos a introducir algo muy importante en programación: el operador % (módulo/resto).
//
//Crea un programa que:
//
//Solicite al usuario un número entero.
//Determine si el número es par o impar.
//Muestre el resultado por consola.
//Restricciones
//
//Utiliza:
//
//Scanner
//int
//if
//else
//Operador %
//
//No utilices métodos como Math, ni operadores ternarios.
public class Ejercicio4_Condicional {
    
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
        System.out.println("Ingresa un numero");
        int num = input.nextInt();
        
        
        if(num % 2 == 0)
        {
            System.out.println("Es Par");
        }
        else
        {
            System.out.println("Es impar");
        }
    
    }

}
