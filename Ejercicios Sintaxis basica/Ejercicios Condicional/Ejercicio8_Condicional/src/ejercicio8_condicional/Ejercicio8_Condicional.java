
package ejercicio8_condicional;
//🟣 Ejercicio 7 — Año bisiesto ⭐⭐⭐
//
//Ahora vamos a trabajar con una condición que parece sencilla, pero tiene varias reglas lógicas.
//
//Crea un programa que solicite un año entero y determine si el año es bisiesto o no bisiesto.
//
//Reglas
//
//Un año es bisiesto cuando:
//
//Es divisible entre 4.
//Pero si también es divisible entre 100, no es bisiesto.
//Excepto si además es divisible entre 400, entonces sí es bisiesto.

public class Ejercicio8_Condicional {
 
    public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);    
    
        System.out.println("Ingrese un ano bisiesto");
        int ano = input.nextInt();
        
      if(ano % 4 != 0)
      {
          System.out.println("No es un anio bisiesto");
      }
      else if(ano % 100 == 0)
      {
          if(ano % 400 == 0)
          {
              System.out.println("Es un anio bisiesto");
          }
          else
          {
              System.out.println("No es un anio bisiesto");
          }
      }
      else
      {
          System.out.println("Es un anio bisiesto");
      }
          
    }
}
