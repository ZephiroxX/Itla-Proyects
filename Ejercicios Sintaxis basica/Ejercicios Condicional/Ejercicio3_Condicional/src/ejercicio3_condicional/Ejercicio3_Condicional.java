
package ejercicio3_condicional;
//🟡 Ejercicio 2 — Mayor de dos números ⭐

import java.util.Scanner;


//Crea un programa que:
//
//Solicite dos números enteros al usuario.
//Determine cuál de los dos números es mayor.
//Si ambos números son iguales, debe indicarlo.
//Muestre el resultado por consola.
//Restricciones
//
//Utiliza solamente:
//
//Scanner
//int
//if
//else if
//else
//Operadores relacionales.
//
//No uses Math.max(), operadores ternarios ni switch.
public class Ejercicio3_Condicional {


    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
    
        System.out.println("Ingresa el primer numero");
        int num = input.nextInt();
        
        System.out.println("Ingres el segundo numero");
        int num2 = input.nextInt();
        
        
        if(num > num2)
        {
            System.out.println("El primer numero ingresado es Mayor");
        }
        else if(num2 > num)
        {
            System.out.println("El segundo numero ingresado es Mayor");
        }
        else
        {
            System.out.println("Los numeros son iguales");
        }
    }

}
