
package ejercicio6_tablademultiplicar;

import java.util.Scanner;

public class Ejercicio6_TablaDeMultiplicar {


    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int resultado = 0;
        System.out.println("Ingresa un numero");
        int num = input.nextInt();
        
       for(int i = 0; i <=10;i++ )
       {
           resultado = num* i;
           
           System.out.println(num+"x"+i +" = "+resultado);
       }

    }

}
