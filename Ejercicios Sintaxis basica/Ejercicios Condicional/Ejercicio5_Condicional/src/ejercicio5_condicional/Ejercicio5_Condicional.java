
package ejercicio5_condicional;
//🟡 Ejercicio 4 — Positivo y par ⭐⭐
//

import java.util.Scanner;

//Ahora vamos a combinar dos condiciones diferentes.
//
//Crea un programa que solicite un número entero y determine:
//
//Si es positivo y par.
//Si es positivo e impar.
//Si es negativo y par.
//Si es negativo e impar.
//Si es cero.
//Restricciones
//
//Utiliza solamente:
//
//Scanner
//int
//if
//else if
//else
//%
//Operadores relacionales.
//Operadores lógicos.
public class Ejercicio5_Condicional {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
       
        System.out.println("Ingresa un numero");
        int num = input.nextInt();
        
        if(num > 0 && num % 2 == 0)
        {
            System.out.println("Es positivo y par.");
        }
        else if(num > 0 && num % 2 != 0)
        {
            System.out.println("Es positivo e impar");
        }
        else if(num < 0 && num % 2 == 0)
        {
            System.out.println("Es negativo y Par");
        }
        else if(num < 0 && num % 2 != 0) 
        {
            System.out.println("Es negativo e Impar");
        }
        else
        {
            System.out.println("Es cero.");
        }
    }

}
