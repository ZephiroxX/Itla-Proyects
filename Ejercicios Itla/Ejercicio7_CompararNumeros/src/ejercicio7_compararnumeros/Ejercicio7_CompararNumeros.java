package ejercicio7_compararnumeros;

import java.util.Scanner;

public class Ejercicio7_CompararNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = input.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = input.nextInt();
        
        if(num1 > num2)
        {
        
            System.out.println("El primer numero es el mayor");
        }
        else
        {
            System.out.println("El primer numero es el menor");
        }
        
        if(num2> num1)
        {
        
            System.out.println("El segundo numero es el mayor");
        }
        else
        {
            System.out.println("El segundo numero es el menor");
        }
        
        
    }

}
