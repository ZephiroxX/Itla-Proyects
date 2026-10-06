
package ejercicio1_informacionpersonal;

import java.util.Scanner;

public class Ejercicio1_InformacionPersonal {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = input.next();
        
        System.out.println("Ingrese su correo electronico");
        String email = input.next();
        
        
        System.out.println("Su nombre es: "+nombre +" Y su correo es: "+email);
    
    
    }

}
