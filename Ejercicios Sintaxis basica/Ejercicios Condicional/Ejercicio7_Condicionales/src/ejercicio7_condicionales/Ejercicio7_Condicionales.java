
package ejercicio7_condicionales;
import java.util.Scanner;

//🔵 Ejercicio 6 — Tres números ⭐⭐⭐
//Ahora vamos a subir un poco la dificultad.

//
//Crea un programa que solicite tres números enteros y determine:
//
//cuál es el mayor;
//cuál es el menor;
//si los tres números son iguales.
public class Ejercicio7_Condicionales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero");
        int n1 =  input.nextInt();
        
        System.out.println("Ingresa el segundo numero");
        int n2 =  input.nextInt();
        
        System.out.println("Ingresa el tercer numero");
        int n3 =  input.nextInt();
        
        
        if(n1 >= n2 && n1 >= n3)
        {
            System.out.println("El primer numero es el mayor");
        }
        else if(n2 >= n1 && n2 >= n3)
        {
             System.out.println("El segundo numero es el mayor");
        }
        else if(n3 >= n2 && n3 >= n1)
        {
            System.out.println("El tercer numero es el mayor");
        }
     
        
        if(n1 <= n2 && n1 <= n3)
        {
            System.out.println("El primer numero es el menor");
        }
        else if(n2 <= n1 && n2 <= n3)
        {
            System.out.println("El segundo numero es el menor");
        }
    
        else if(n3 <= n2 && n3 <= n1)
        {
            System.out.println("El tercer numero es el menor");
        }
        
        
        if(n1 == n2 && n2 == n3)
        {
            System.out.println("Los numeros son iguales");
        }

    }
}
