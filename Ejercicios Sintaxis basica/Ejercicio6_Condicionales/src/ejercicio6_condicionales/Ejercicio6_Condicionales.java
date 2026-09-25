
package ejercicio6_condicionales;

//🟠 Ejercicio 5 — Calificación ⭐⭐⭐

import java.util.Scanner;

//
//Ahora vamos a trabajar con rangos, que es algo que encontrarás muchísimo en programación.
//
//Crea un programa que solicite al usuario una calificación entera entre 0 y 100 y muestre:
//
//Calificación	Resultado
//90–100	Excelente
//80–89	Muy bueno
//70–79	Bueno
//60–69	Regular
//0–59	Reprobado
public class Ejercicio6_Condicionales {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Ingrese una nota entre o y 100");
        int nota = input.nextInt();
        
        if(nota < 0 || nota > 100)
        {
            System.out.println("Error: Nota invalida");
        }
        else
        { 
            if(nota >= 90 && nota <= 100)
            {
                System.out.println("Excelente");
            }
            else if (nota >= 80)
            {
                System.out.println("Muy bueno");
            }
            else if(nota >= 70)
            {
                System.out.println("Bueno");
            }
            else if(nota >= 60)
            {
                System.out.println("Regular");
            }
            else
            {
                System.out.println("Reprobado");
            }
        }
        
        
    }

}
