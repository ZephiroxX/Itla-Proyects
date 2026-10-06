
package ejercicio8_numeropar;
import java.util.Scanner;

public class Ejercicio8_NumeroPar {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num  = input.nextInt();
        
        if(num % 2 ==0 )
        {
            System.out.println("Es un numero par");
        }
        else
        {
            System.out.println("No es un numero par");
        }
    }

}
