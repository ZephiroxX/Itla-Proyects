
package ejercicicio10_condicional;
import java.util.Scanner;
//🟣 Ejercicio 9 — Calculadora básica ⭐⭐⭐⭐
//


//Crea un programa que solicite:
//
//Primer número.
//Segundo número.
//Una operación: +, -, * o /.
//
//El programa debe realizar la operación seleccionada.
//
//Además:
//
//Si el usuario intenta dividir entre 0, debe mostrar un mensaje indicando que la división no es posible.
//Si introduce una operación diferente de las permitidas, debe mostrar un mensaje de operación inválida.
//
//Debes practicar: if, else if, else, operadores y validaciones.
public class Ejercicicio10_Condicional {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int n1 = input.nextInt();
        
        System.out.println("Ingrese el primer numero");
        int n2 = input.nextInt();
        
        System.out.println("Eliga una operacion");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        int opcion = input.nextInt();
        
            
            if(opcion == 1)
            {
               int suma = n1 + n2;
                System.out.println("La suma de los numeros es: "+suma);
            } 
            else if(opcion == 2)
            {
               int resta = n1 - n2;
                System.out.println("La resta de los numeros es: "+resta);
            
            }
            else if(opcion == 3)
            {
               int multiplicacion  = n1 * n2;
                System.out.println("La multiplicacion de los numeros es: "+multiplicacion);
            }
            else if(opcion == 4)
            {
                if(n2 == 0)
                {
                    System.out.println("La division no es posible");
                }
                else
                {
                   double division = (double)n1 / n2;
                    System.out.println("La division de los numeros es: "+division);
                }
            }
            else
            {
                System.out.println("Error: Numero invalido");
            }

    }
}
