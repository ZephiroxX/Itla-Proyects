
package ejercicio.pkg11_condicional;
import java.util.Scanner;

//🟣 Ejercicio 10 — Clasificación de edad ⭐⭐⭐⭐
//
//Crea un programa que solicite la edad de una persona.
//
//Debe clasificarla de esta manera:
//
//Menor de 0 → edad inválida.
//0–12 → Niño.
//13–17 → Adolescente.
//18–64 → Adulto.
//65 o más → Adulto mayor.
//
//El programa debe mostrar únicamente una categoría.
//
//Debes practicar: if, else if, else y rangos.

public class Ejercicio11_Condicional {
  
    public static void main(String[] args) {
    Scanner input =  new Scanner(System.in);
    
        System.out.println("Ingrese su edad");
        int edad = input.nextInt();
        
        
        
        if(edad < 0)
        {
            System.out.println("Edad inválida");
        }
        else
        {
        
            if(edad <= 12)
            {
                System.out.println("Nino");
            }
            else if (edad <= 17)
            {
                System.out.println("Adolescente");
            }
            else if (edad <= 64)
            {
                System.out.println("Adulto");
            }
            else 
            {
                System.out.println("Adulto Mayor");
            }
        
        }
    }   

}
    